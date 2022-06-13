package com.chainsys.springproject.lifecycle;

public class LifeCycleBean {
      public void print() {
    	  System.out.println("print called");
      }
      public LifeCycleBean() {
    	  System.out.println("LifeCycleBean has called");
      }
      public void setUp() {
    	  System.out.println("Starting....");
      }
      public void close() {
    	  System.out.println("Closing...");
      }
}
