package com.mustafazorbaz.command;

public class UndoCommand implements ICommand {

	@Override
	public void execute() {
		 System.out.println("Undo command çalýþtý...");
	}

}
