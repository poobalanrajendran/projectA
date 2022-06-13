package com.chainsys.springproject.beans;

public abstract class MainCourse {
    public String name;
}
 class NorthIndian extends MainCourse{
	  
	  public NorthIndian() {
		  name = "Chapatti";
	  }
}
 class SouthIndian extends MainCourse{
	  public SouthIndian() {
		  name = "Rice";
	  }
 }
 class Chinese extends MainCourse{
	  public Chinese() {
		  name = "Noodles";
	  }
 }
	

