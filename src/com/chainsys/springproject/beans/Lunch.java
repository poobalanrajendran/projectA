package com.chainsys.springproject.beans;

public class Lunch {
	  private Starters entree;
	  private MainCourse mainfood;
	  private Dessert sweets;
	  // Constructor based Dependency Injection
	  public Lunch(Starters s,MainCourse m, Dessert d) {
		  System.out.println("Lunch is Ready");
		  
		  entree = s;
		  mainfood = m;
		  sweets = d;
	  }
	  public void serve() {
		  System.out.println(entree.name);
		  System.out.println(mainfood.name);
		  System.out.println(sweets.name);
	  }
	}
	 /*
	  * Lunch
	  * Starters, chicken Soup,VegRoll
	  * MainCourse ,SouthIndian, NorthIndian, Chinese
	  * Dessert , IceCream, Sweets,Cake
	  */