package com.chainsys.springproject.beans;

public class Car {
public Engine petrolEngine;
public Wheel alloy;
public void start()
{
	petrolEngine.start();
	alloy.rotate();
	}

public void move()
{
	alloy.rotate();
}
}
