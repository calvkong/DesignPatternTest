package com.test.patterns.command.receiver;

public class TV {
	private String state;
	
	public void on() {
		System.out.println("TV is on");
		state = "on";
	}

	public void off() {
		System.out.println("TV is off");
		state = "off";
	}

	@Override
	public String toString() {
		return "TV: " + state;
	}

}
