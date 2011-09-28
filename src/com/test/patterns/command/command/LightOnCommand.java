package com.test.patterns.command.command;

import com.test.patterns.command.receiver.Light;

public class LightOnCommand implements Command {
	private Light light;
	
	public LightOnCommand(Light light){
		this.light = light;
	}
	
	public void execute() {
		light.on();
	}

	public void undo() {
		light.off();
	}
}
