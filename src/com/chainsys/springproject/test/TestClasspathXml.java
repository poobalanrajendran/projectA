package com.chainsys.springproject.test;

import org.springframework.context.ApplicationContext;   // interface
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;    //implemented class

import com.chainsys.springproject.autowire.Car;
import com.chainsys.springproject.autowire.CarServices;
import com.chainsys.springproject.beans.Actor;
import com.chainsys.springproject.beans.Calendar;
import com.chainsys.springproject.beans.Customer;
import com.chainsys.springproject.beans.Employee;
import com.chainsys.springproject.beans.Lunch;
import com.chainsys.springproject.beans.Scoreboard;
import com.chainsys.springproject.lifecycle.AnnotationLC;
import com.chainsys.springproject.lifecycle.InitDesposeBean;
import com.chainsys.springproject.lifecycle.LifeCycleBean;


public class TestClasspathXml {
	public static void testA() {
		Employee emp = new Employee();
		emp.setId(101);
		emp.setName("kowsi");
		emp.print();	
	}
	
	public static void testB() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		//Employee emp = ac.getBean("emp2",Employee.class);  // overloaded method of getBean(Class) return object of the class
		Employee emp1 =(Employee)ac.getBean("emp3");   // overloaded method of getBean(String)
		emp1.setId(101);
		emp1.setName("kowsi");
		emp1.print();
//		
//		Customer c1= ac.getBean(Customer.class);
//		c1.setId(1);
//		c1.setName("kumar");
//	c1.print();
//		
	}
	
	public static void testlazyInit(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Employee emp = ac.getBean(Employee.class);
		Customer c1= ac.getBean(Customer.class);
		 //lazy-init is true for customer an object is created now(firstcall to getbean method for customer method) 
		Employee emp2 = ac.getBean(Employee.class);
		Customer c2= ac.getBean(Customer.class);
		System.out.println(emp.hashCode());
		System.out.println(emp2.hashCode());
	System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
	}
	
	
	public static void testPrototype() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Actor hero = ac.getBean(Actor.class);
		Actor heroin = ac.getBean(Actor.class);
     	Actor comedian = ac.getBean(Actor.class);
		Actor friend = ac.getBean(Actor.class);
		
		System.out.println(hero.hashCode());
		System.out.println(heroin.hashCode());
		System.out.println(comedian.hashCode());
		System.out.println(friend.hashCode());
	
	}
	public static void testBeanWithConstructor() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
	}
	public static void testFactorymethod() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Scoreboard sb = ac.getBean("sb1",Scoreboard.class);    // calling  xml id
		sb.targetScore = 183;      
		System.out.println(sb.targetScore);
		Scoreboard sb2 = ac.getBean("sb2",Scoreboard.class);  		
		System.out.println(sb2.targetScore);

	}
	
	public static void testCalendartFactory() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Calendar today = ac.getBean(Calendar.class);
		today.day = 9;
		today.month = "may";
		today.year = 2022;
		System.out.println(today.day);
		System.out.println(today.month);
		System.out.println(today.year);
	}

	public static void testLunchFactory() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("lunch.xml");
		Lunch nvsilunch = ac.getBean("nvsilunch",Lunch.class);
		Lunch vsilunch = ac.getBean("vsilunch",Lunch.class);
		Lunch nilunch = ac.getBean("nilunch",Lunch.class);
		Lunch chlunch = ac.getBean("chlunch",Lunch.class);
		nvsilunch.serve();
		System.out.println("--------");
		vsilunch.serve();
		System.out.println("--------");
		nilunch.serve();
		System.out.println("--------");
		chlunch.serve();
		}
	public static void testSetterDi()
	{
		ApplicationContext ac1 = new ClassPathXmlApplicationContext("beans.xml");
		Employee emp=ac1.getBean("emp3",Employee.class);
		emp.print();
	}
	
	public static void testLifeCycle() {
        ConfigurableApplicationContext ac = new ClassPathXmlApplicationContext("Lc.xml");
        LifeCycleBean lf =ac.getBean(LifeCycleBean.class);
        lf.print();
        
        lf=null;
        //System.gc();
        ac.close();
        ac=null;
    }

    public static void testAutoWire() {
        ConfigurableApplicationContext ac = new ClassPathXmlApplicationContext("Autowore.xml");
        Car lf =ac.getBean("car",Car.class);
        lf.start();
        lf.move();
        lf=null;
        ac.close();
        
    }
    public static void testAutoWireQualifier() {
        ConfigurableApplicationContext ac = new ClassPathXmlApplicationContext("Autowore.xml");
        CarServices lf =ac.getBean(CarServices.class);
        lf.startTrip();
         
    }
    public static void testInitDestroyBean() {
		ConfigurableApplicationContext ac = new ClassPathXmlApplicationContext("Lc.xml");
		InitDesposeBean init = ac.getBean(InitDesposeBean.class);
		init.print();

	}
	public static void testAnnotationLC() {
		ConfigurableApplicationContext ac = new ClassPathXmlApplicationContext("Lc.xml");
		AnnotationLC annlc = ac.getBean(AnnotationLC.class);
		annlc.print();
		}
}