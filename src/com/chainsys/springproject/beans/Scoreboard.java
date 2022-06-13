package com.chainsys.springproject.beans;

public class Scoreboard {
public int targetScore;
private Scoreboard()
{
	System.out.println("Scoreboard oject is created");
}
private Scoreboard(int runs)
{
	targetScore=runs;
	System.out.println("Scoreboard object is created");
}
//factory method
public static Scoreboard createObject()
{
	return new Scoreboard();
}
public static Scoreboard createObject(int runs)
{
	return new Scoreboard(runs);
}
	
}