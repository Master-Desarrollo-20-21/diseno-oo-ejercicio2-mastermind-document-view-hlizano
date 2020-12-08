package com.escuelait.views;

import com.escuelait.models.Game;
import com.escuelait.utils.Console;

public class BoardView {
	
	private Game game;

	public BoardView(Game game) {
	    this.game = game;
	}

	public void write() {
		Console.getInstance().writeln(Message.TITLE.toString());
		int attempt = game.getAttempts();
		for (int i = 0; i<attempt; i++) {
			Console.getInstance().writeln(i + Message.ATTEMPTS.toString());
			Console.getInstance().writeln(Message.SECRET_COMBINATION.toString());

			// TESTING PURPOSES
			// Console.getInstance().write(game.getSecretCombination());
			// Console.getInstance().writeln(Message.TOOLTIP.toString());
			
			if (attempt > 0) {
				new ProposedCombinationView(this.game.getProposedCombination(i)).write();	
			}
		}
	}
}
