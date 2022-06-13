package com.chainsys.springproject.beans;

public class CalendarFactory {
public Calendar createCalendar()
{//the claendar constructor is default acces modifier so, can be called here
	//the calendar class and the calendar; factory class are both in the same package
	return new Calendar();
}
public Appointments createAppointment()
{
	return new Appointments();
}
}
