package com.escuelait.views.console;

import com.escuelait.models.Color;
import com.escuelait.models.ProposedCombination;
import com.escuelait.utils.Console;
import com.escuelait.views.Message;

public class ProposedCombinationView {
	
	ProposedCombination proposedCombination;
	
	public ProposedCombinationView() {
		this.proposedCombination = new ProposedCombination();
	}
	
	public ProposedCombinationView(ProposedCombination proposedCombination) {
		this.proposedCombination = proposedCombination;
	}

	public ProposedCombination read(String title) {
		boolean isValid = false;
		Console console = Console.getInstance();
		String proposedCombinationColors = "";
		
		do {			
			console.write(title);
			proposedCombinationColors = console.readString().toLowerCase();
			isValid = this.checkProposedCombination(proposedCombinationColors);
		}while (!isValid);
		console.writeln("");
		proposedCombination.setProposedCombinationColors(proposedCombinationColors);		
		return proposedCombination;
	}	
	
	public boolean checkProposedCombination(String colors) {
		if (!checkLength(colors)) {
			Console.getInstance().writeln(Message.WRONG_PROPOSED_COMBINATION_LENGTH.toString());
			return false;
		}

		if (!isValidColors(colors)) {
			Console.getInstance().writeln(Message.WRONG_COLORS.toString());
			return false;
		}
		return true;
	}
	
	public static boolean checkLength(String colors) {		
		return colors.length()==4;
	}

	public static boolean isValidColors(String colors) {	
		boolean isValid = false;
		for(int i = 0; i< colors.length(); i++) {
			String color = Character.toString(colors.charAt(i));
			for(Color c : Color.values()) {
				if(c.name().equals(color)) {
					isValid = true;
				}
			}			
		}		
		return isValid;
	}

	public void write() {
		String colors = proposedCombination.getColors();
		int whites = proposedCombination.getWhites();
		int blacks = proposedCombination.getBlacks();
		Console.getInstance().writeln(colors + " --> " + blacks + " blacks " + "and " + whites + " whites");
	}

}
