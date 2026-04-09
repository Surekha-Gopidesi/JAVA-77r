package com.inheritance.multilevel;


public class Device {
	public void powerOn() {
		System.out.println("Device power on");
	}

}
class Mobile extends Device{
	public void call() {
		System.out.println("Calling");
	}
}
class SmartPhone extends Mobile{
	public void browseInternet() {
		System.out.println("Browsing Internet");
	
	}
}
