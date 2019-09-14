package com.example.Service;

import com.example.Data.Usersource;
import com.example.demo.Service;

public class UsersourceService implements Service {
    static UsersourceService service;
    private Usersource source;
    private String name="UsersourceService";
	public static synchronized UsersourceService getService() {
		if(service!=null) {
			return service;
		}else {
			service=new UsersourceService();			
			System.out.println("UsersourceService is ready!");
			return service;
		}
    }


    public UsersourceService(){
        source=new Usersource();
    }

    public Usersource getsource(){
        return source;
    }

    @Override
    public Object get(String ServiceCommand) {
        return getsource();
    }
    @Override
    public String toString() {
        return name;
    }
}