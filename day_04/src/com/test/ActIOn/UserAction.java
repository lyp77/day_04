package com.test.ActIOn;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionSupport;
import com.test.Service.UserService;

public class UserAction extends ActionSupport {
		@Override
		public String execute() throws Exception {
			// TODO Auto-generated method stub
			System.out.println(1);
			ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
			UserService service = (UserService) context.getBean("service");
			service.add();
			return NONE;
		}
}
	