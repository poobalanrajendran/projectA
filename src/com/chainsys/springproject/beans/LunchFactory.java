package com.chainsys.springproject.beans;

public class LunchFactory {
    public Lunch createNonVegSouthIndianLunch() {
        Starters s1 = new Chicken();
        s1.name="Honeychicken";
        MainCourse m= new SouthIndian();
        m.name="Rice";
        Dessert d = new Cake();
        d.name="ChocoBrownie";
        Lunch l =new Lunch(s1,m,d);
        return l;
    }
    public Lunch createVegSouthIndianLunch() {
        Starters s1 = new VegRoll();
        s1.name="Cabbageroll";
        MainCourse m= new SouthIndian();
        m.name="Rice";
        Dessert d = new Cake();
        d.name="Falooda";
        Lunch l =new Lunch(s1,m,d);
        return l;
    }
    public Lunch createNorthIndianLunch() {
        Starters s1 = new Soup();
        s1.name="corn";
        MainCourse m= new NorthIndian();
        m.name="Chappatti";
        Dessert d = new Sweets();
        d.name="Rassagulla";
        Lunch l =new Lunch(s1,m,d);
        return l;
    }
    
    public Lunch createChineseLunch() {
        Starters s1 = new VegRoll();
        s1.name="corn";
        MainCourse m= new NorthIndian();
        m.name="Chappatti";
        Dessert d = new Sweets();
        d.name="Rassagulla";
        Lunch l =new Lunch(s1,m,d);
        return l;
        
        
    }

}