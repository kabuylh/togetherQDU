package com.example.ServiceCore;

import java.util.Hashtable;

/**
 * 服务注册器
 * 服务列表：哈希表
 */
public class ServiceManager{
    static Hashtable<String,Object> Services=new Hashtable<>();
    static ServiceManager service;

	public static synchronized ServiceManager getService() {
		if(service!=null) {
			return service;
		}else {
			service=new ServiceManager();			
			System.out.println("ServiceManager is ready!");
			return service;
		}
	}
	/**
	 * 服务注册
	 * @param o 被注册的服务 
	 */
    public static void addService(Object o){
        Services.put(o.toString(), o);
	}
	/**
	 * 服务注入
	 */
    public static  Object DI(String ServiceName){
        Object o=Services.get(ServiceName);
		if(o!=null) {
			return o;			
		}else {
			System.out.println("DI can not find "+ServiceName);
			return null;
		}
    }
}
