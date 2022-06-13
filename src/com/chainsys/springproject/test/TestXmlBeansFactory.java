package com.chainsys.springproject.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.chainsys.springproject.beans.Customer;
import com.chainsys.springproject.beans.Employee;

public class TestXmlBeansFactory {
	public static void testA()
	{
		//ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		ClassPathResource res=new ClassPathResource("beans.xml");
		XmlBeanFactory factory = new XmlBeanFactory (res); 
		Employee emp=factory.getBean("empalias",Employee.class);
		emp.setId(36);
		emp.setName("java");
		emp.print();
		System.out.println(factory.isSingleton("emp"));
		System.out.println(factory.getBean("emp") instanceof Employee);
		System.out.println(factory.isSingleton("emp"));
		System.out.println(factory.getBean("emp") instanceof Customer);
		System.out.println(factory.isPrototype("emp"));
		System.out.println(factory.isTypeMatch("emp", Employee.class));
		
		
	}

}
