package com.example.Service;

import com.example.Data.User;
import com.example.demo.Service;

public class UserService implements Service {
    static UserService service;
    private User user;
    private String name="UserService";
	public static synchronized UserService getService() {
		if(service!=null) {
			return service;
		}else {
			service=new UserService();			
			System.out.println("UserService is ready!");
			return service;
		}
    }
    
    public UserService(){
        user=new User("suhuyuan","123456");
    }

    public User getUser(){
        return user;
    }

    @Override
    public Object get(String ServiceCommand) {
        return getUser();
    }

    @Override
    public String toString() {
        return name;
    }
    
}