package com.escuelait.views.console;

import com.escuelait.models.Game;
import com.escuelait.utils.Console;
import com.escuelait.views.Message;

public class AttemptView {
	
	private Game game;

	public AttemptView(Game game) {
	    this.game = game;
	}

	public void write() {		
		int attempt = game.getAttempt();
		Console.getInstance().writeln(attempt + Message.ATTEMPTS.toString());
		// Console.getInstance().write(game.getSecretCombination());			// TESTING PURPOSES
		Console.getInstance().writeln(Message.SECRET_COMBINATION.toString());
		
		for (int i = 0; i<attempt; i++) {			
			new ProposedCombinationView(this.game.getProposedCombination(i)).write();	
		}
	}
}
