package com.test.patterns.command.invoker;

import com.test.patterns.command.command.Command;

public class SimpleLightControl {

	private Command[] slots;
	
	public SimpleLightControl(){
		slots = new Command[2];
	}
	
	public void setCommand(int i, Command command){
		slots[i] = command;
	}
	
	public void buttonPressed(int i){
		slots[i].execute();
	}

	public void buttonUnpressed(int i){
		slots[i].undo();
	}

}
