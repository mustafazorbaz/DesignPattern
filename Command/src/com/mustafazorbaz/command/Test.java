package com.mustafazorbaz.command;

public class Test {

	public static void main(String[] args) {
		Invorker  invorker =new Invorker();
		invorker.addCommand(new RedoCommand());
		invorker.addCommand(new UndoCommand());
		
		invorker.executeAll();
	}

}
