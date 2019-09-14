package com.example.demo;

import com.example.Service.UserClassService;
import com.example.Service.UserService;
import com.example.Service.UsersourceService;
import com.example.ServiceCore.CoreService;
import com.example.ServiceCore.ServiceManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		/**
		 * 进行最基础的服务运行与服务注册
		 */
		ServiceManager.getService();
		CoreService.getService();
		ServiceManager.addService(UserService.getService());
		ServiceManager.addService(UsersourceService.getService());
		ServiceManager.addService(UserClassService.getService());

	}
}
