package com.test.app;

import com.test.patterns.command.command.LightOffCommand;
import com.test.patterns.command.command.LightOnCommand;
import com.test.patterns.command.invoker.SimpleLightControl;
import com.test.patterns.command.receiver.Light;

public class CommandTester {

	public static void main(String[] args){
		SimpleLightControl lightControl = new SimpleLightControl();
		
		Light light = new Light();
		lightControl.setCommand(0, new LightOnCommand(light));
		lightControl.setCommand(1, new LightOffCommand(light));
		
		lightControl.buttonPressed(0);
		lightControl.buttonUnpressed(0);
		lightControl.buttonPressed(1);
		lightControl.buttonUnpressed(1);
		lightControl.buttonPressed(1);
		lightControl.buttonUnpressed(1);
		lightControl.buttonPressed(0);
		lightControl.buttonUnpressed(0);
		lightControl.buttonPressed(0);
		lightControl.buttonUnpressed(0);
		
	}
}
