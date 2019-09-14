package com.example.demo;

import com.example.ServiceCore.Command;
import com.example.ServiceCore.PackageProxy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello2 {
    
    @RequestMapping("/index2")
    public String index() {

        Command command=new Command("Get", 
                                    new String[]{"UsersourceService","UserService"}, 
                                    new String[]{"","",""});
        PackageProxy package2=new PackageProxy(command, new UserResult2());
        UserResult2 result=(UserResult2)package2.getResult();
        return result.toString();
    }
    
}
