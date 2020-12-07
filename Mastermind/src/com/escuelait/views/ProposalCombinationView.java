package com.escuelait.views;

import com.escuelait.models.Color;
import com.escuelait.models.ProposalCombination;
import com.escuelait.utils.Console;

public class ProposalCombinationView {

	public ProposalCombination read(String title) {
		boolean isValid = false;
		Console console = Console.getInstance();
		ProposalCombination proposalCombination = new ProposalCombination();
		String colors = "";
		
		do {			
			console.writeln(title);
			colors = console.readString().toLowerCase();
			isValid = this.checkProposalCombination(colors);
		}while (!isValid);
		
		proposalCombination.setColors(colors);		
		return proposalCombination;
	}	
	
	public boolean checkProposalCombination(String colors) {
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

}
