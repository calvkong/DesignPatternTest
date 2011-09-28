package com.test.patterns.command.command;

import com.test.patterns.command.receiver.TV;

public class TVOffCommand implements Command {

	private TV tv;
	
	public TVOffCommand(TV tv){
		this.tv = tv;
	}
	
	public void execute() {
		tv.off();
	}

	public void undo() {
		tv.on();
	}

}
