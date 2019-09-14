package com.example.Service;

import com.example.Data.UserClass;
import com.example.demo.Service;
public class UserClassService implements Service{
    static UserClassService service;
    private UserClass userClass;
    private String name="UserClassService";
    /**
     * 单体模式
     * @return
     */
	public static synchronized UserClassService getService() {
		if(service!=null) {
			return service;
		}else {
			service=new UserClassService();			
			System.out.println("UserClassService is ready!");
			return service;
		}
    }

    public UserClassService(){
        userClass=new UserClass("suhuyuan", 1, "语文", 80);
    }

    /**
     * 服务对外接口
     */
    @Override
    public Object get(String ServiceCommand) {
        if(ServiceCommand=="suhuyuan,课程名")
        return new UserClassResult(userClass.getClassNumber(), userClass.getClassName());
        return null;
    }

    /**
     * 用于获得服务名称
     */
    @Override
    public String toString() {
        return name;
    }


}

class UserClassResult{
    public int classNumber;
    public String className;

    public UserClassResult(int classNumber, String className) {
        this.classNumber = classNumber;
        this.className = className;
    }
     
}