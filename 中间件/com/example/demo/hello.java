package com.example.demo;

import com.example.ServiceCore.Command;
import com.example.ServiceCore.PackageProxy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    
    @RequestMapping("/index")
    public String index() {
        /**
         * 通过Command来生成请求字符串
         * 创建请求传输通道PackageProxy，并且将Command对象和需要接受的数据实体注入
         * 通过传输通道中的方法getResult（）来获得所需要的数据实体
         */
        Command command=new Command("Get", 
                                    new String[]{"UsersourceService","UserService","UserClassService"}, 
                                    new String[]{"","","suhuyuan,课程名"});
        PackageProxy package1=new PackageProxy(command, new UserResult());//UserResult为所需要的数据实体
        UserResult result=(UserResult)package1.getResult();
        return result.toString();
    }
    
}
