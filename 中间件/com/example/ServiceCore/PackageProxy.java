package com.example.ServiceCore;


import java.lang.reflect.Field;
import java.util.Hashtable;

/**
 * 传输通道代理
 * 代理模式
 */
public class PackageProxy {
    private Package commandpackage;
    private Hashtable result=new Hashtable<String ,ValueObj>();
    private Object object;
    private boolean lock=false;
    
    /**
     * 传输通道代理需要命令和结果数据实体
     * @param command
     * @param objcet
     */
    public PackageProxy(Command command,Object objcet){
        commandpackage=new Package(command);
        if(objcet!=null){
            this.object=objcet;     
            if(!commandpackage.sendCommand()){
                System.out.println("sendCommand error");
                return;
            };       
        }

        new Thread(){
            public  void run(){
                changeObject();
            };
        }.start();
    }

    /**
     * 服务结果数据实体转化
     */
    private void changeObject(){
        try{
            Object[] resobj=(Object[])commandpackage.ResultQueue.take();     
                if(resobj!=null){
                    for(Object resobj2 :resobj){//提取结果
                        if(resobj2==null)continue;
                        Class<?>resultobj=resobj2.getClass();
                        // 取得类的全部属性
                        Field[] field = resultobj.getDeclaredFields();
                        for (int i = 0; i < field.length; i++) {
                            // 哈希检测
                            field[i].setAccessible(true);//更改访问权限
                            if(result.containsKey(field[i].getName()))continue;
                            //取出数据，放入哈希表
                            result.put(field[i].getName(), 
                                       new ValueObj(field[i].getType().getName(),field[i].get(resobj2)));
                            System.out.println(field[i].getName() + "    "+field[i].get(resobj2));
                        }
                    }            
                }
                Field[] obj=object.getClass().getDeclaredFields();//获得所有属性
                for (int i = 0; i < obj.length; i++) {
                    // 属性权限更改
                    obj[i].setAccessible(true);
                    //值注入
                    if(result.containsKey(obj[i].getName())){
                        obj[i].set(object, 
                                   getValue((ValueObj)result.get(obj[i].getName())));
                    }
                }
                lock=true;    
                return;              
            }
            catch(Exception e){
            e.printStackTrace();
        }
    }

    public Object getResult(){
        while(!lock){
            try{
                Thread.sleep(2);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return object;
    }


    private Object getValue(ValueObj obj) {
        return obj.Value;
    }
}

class ValueObj{
    public String Type;
    public Object Value;

    public ValueObj(String type, Object value) {
        Type = type;
        Value = value;
    }
    
    
}