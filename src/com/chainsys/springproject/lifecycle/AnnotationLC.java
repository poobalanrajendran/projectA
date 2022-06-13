package com.chainsys.springproject.lifecycle;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
// not working 
public class AnnotationLC {
	public AnnotationLC() {
		System.out.println("Annotation object created" +hashCode());
	}
    @PostConstruct
	public void start() {
		System.out.println("Start AnnotationLC");
	}
    @PreDestroy
	public void stop() {
		System.out.println("Stoped AnnotationLC");
	}
    public void print() {
    	System.out.println("Print Annotation called");
    }

}
