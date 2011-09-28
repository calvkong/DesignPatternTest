package com.test.patterns.command.receiver;

public class Light {
	
	private String state;
	
	public void on() {
		System.out.println("Light is on");
		state = "on";
	}

	public void off() {
		System.out.println("Light is off");
		state = "off";
	}

	@Override
	public String toString() {
		return "Light: " + state;
	}

}
