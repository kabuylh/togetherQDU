package com.example.ServiceCore;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * 中心服务
 * 接受通道传入的请求和结果返回通道
 * 通过请求来进行服务调控
 * 
 * 这只是思想原型demo
 * 完整的中心服务构件应该是这样的：
 * 中心服务代理————>中心服务————>服务调用
 * （还未实现）           （先用异步来实现思想原型）
 */
public class CoreService {
    static BlockingQueue commqueue=new LinkedBlockingDeque<Command>(10);//接受请求通道
    static CoreService service;

	public static synchronized CoreService getService() {
		if(service!=null) {
			return service;
		}else {
			service=new CoreService();			
			System.out.println("CoreService is ready!");
			return service;
		}
    }
    public CoreService(){
        new Thread(){
            public void run(){
                try{
                    while(true){
                        Command command=(Command)commqueue.take();//取请求
                        if(command!=null){
                            System.out.println("命令收到");
                            ServiceDO ctt = new ServiceDO(command);  //服务处理
                            FutureTask<Object> ft = new FutureTask<>(ctt);
                            new Thread(ft).start();
                            command.Resultqueue.add(ft.get());//将服务结果传回
                        }  
                    }                   
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            };
        }.start();
    }

    
}