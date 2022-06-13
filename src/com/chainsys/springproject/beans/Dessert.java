package com.chainsys.springproject.beans;


public class Dessert {

	public Object name;

}
class IceCream extends Dessert{
	public IceCream (){
		name = "choculate";
	}
	
}
class Sweets extends Dessert{
	public Sweets() {
		name = "laddu";
	}
	
	
}
class Cake extends Dessert{
	public Cake() {
		name = "redvelvet";
	}
	
		public Cake(String name) {
this.name = name;		}
		
}
