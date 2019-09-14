package com.example.ServiceCore;
import com.example.demo.*;

import java.util.concurrent.Callable;

/**
 * 服务调用
 * 服务调用应该是服务中心的功能之一，此乃思想原型，并非实现版本
 * 服务调用构件思路如下：
 * 服务调用核心————>服务调用代理————>服务组合器
 * （服务中心）  （服务调用代理模板）  
 */
public class ServiceDO implements Callable<Object> {
    private Command command;
    public ServiceDO(Command command){
        this.command=command;
    }
    @Override  
    public Object call() throws Exception  
    {  
        /**
         * 提取请求
         */
        String  head=command.RequestHead;
        Service[] service=new Service[command.ServiceName.length];
        Object[] result=new Object[command.ServiceName.length];
        int i=0;
        for(String str :command.ServiceName){
            service[i]=(Service)ServiceManager.DI(str);//获取服务
            i++;
        }
        i=0;
        for(Service s :service){
            result[i]=s.get(command.ServiceCommand[i]);//将服务结果收集
            i++;
        }
        return result;//服务结束返回结果
    }  
}
