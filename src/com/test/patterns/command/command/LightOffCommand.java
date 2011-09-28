package com.test.patterns.command.command;

import com.test.patterns.command.receiver.Light;

public class LightOffCommand implements Command {
	private Light light;
	
	public LightOffCommand(Light light){
		this.light = light;
	}
	
	public void execute() {
		light.off();
	}

	public void undo() {
		light.on();
	}
}
