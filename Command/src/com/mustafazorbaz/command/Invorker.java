package com.mustafazorbaz.command;

import java.util.Stack;

public class Invorker {
	private Stack<ICommand> commands =new Stack<ICommand>();
	public void executeAll(){
		while(commands.size()>0){
			commands.pop().execute();
		}
	}
	public void addCommand(ICommand command) {
		commands.push(command);
	}
}
