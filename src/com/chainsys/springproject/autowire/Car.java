package com.chainsys.springproject.autowire;

//import javax.annotation.Resources;
//import javax.annotation.PreDestroy;
//
//import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.beans.factory.annotation.Required;
////import org.springframework.beans.factory.annotation.C;
//import org.springframework.stereotype.Component;
//
//
//public  class Car {
//	@Autowired
//	private Engine petrolEngine;
//	@Autowired(required=false)
//	
//	private Wheel alloy;
////	public Engine getPetrolEngine() {
////		return petrolEngine;
////	}
////	public void setPetrolEngine(Engine petrolEngine) {
////		this.petrolEngine = petrolEngine;
////	}
////	public Wheel getAlloy() {
////		return alloy;
////	}
////	public void setAlloy(Wheel alloy) {
////		this.alloy = alloy;
//	//}
//	
//	public Car() {
//		System.out.println("1 Car Object created "+ hashCode());
//	}
//	public Car(Engine petrolEngine,Wheel alloy) {
//		System.out.println("2 Car Object created "+ hashCode());
//		this.petrolEngine=petrolEngine;
//		this.alloy=alloy;
//	}
//	
//	//@PostConstruct
//	public void begin() {
//		System.out.println("Start AnnotationLC");
//	}
//   // @PreDestroy
//	public void stop() {
//		System.out.println("Stoped AnnotationLC");
//	}
//    public void print() {
//    	System.out.println("Print Annotation called");
//    }
//	public void start() {
//		petrolEngine.start();
//	}
//	public void move() {
//		alloy.rotate();
//	}
//
//}
//@Component("SportsCar")
//class SportsCar extends Car{
//	public SportsCar()
//	{
//		System.out.println("sports car objected creared"+hashCode());
//	}}
//@Component("SuvCar")
//	class SuvCar extends Car{
//		public SuvCar()
//		{
//			System.out.println("sports car objected creared"+hashCode());
//		}
//	}
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
//import javax.annotation.Resource; not working
import org.springframework.stereotype.Component;

public class Car {
    @Autowired
    private Engine petrolEngine;
    @Autowired(required = false)
    private Wheel alloy;

    public Car() {
        System.out.println("1 Car Object created " + hashCode());
    }

    public void start() {
        petrolEngine.start();
    }

    public void move() {
        alloy.rotate();
    }

    public void begin() {
        System.out.println("Start Annotation...");
    }

    public void stop() {
        System.out.println("Stop Annotation...");
    }

    public void print() {
        System.out.println("Print Annotation is called");
    }

}

@Component("SportsCar")
class SportsCar extends Car {
    public SportsCar() {
        System.out.println("Sports car created" + hashCode());
    }

    @Component("SuvCar")
    class SuvCar extends Car {
        public SuvCar() {
            System.out.println("Suv car created" + hashCode());
        }
    }
}