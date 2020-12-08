package com.escuelait.views;

import com.escuelait.models.Game;
import com.escuelait.utils.Console;
import com.escuelait.models.ProposedCombination;

public class PlayView extends View{

	public PlayView(Game game) {
		super(game);
	}
	
	@Override
	public void interact() {
	    do {
			new BoardView(this.game).write();
			ProposedCombination proposedCombination = new ProposedCombinationView().read(Message.PROPOSE_COMBINATION.toString());	
			game.processProposedCombination(proposedCombination);
		}while(!this.gameEnded());
	}

	private boolean gameEnded() {
		int attempt = this.game.getAttempts();
		int MAX_ATTEMPTS = this.game.getMaxAttempts();
		ProposedCombination proposedCombination = this.game.getProposedCombination(attempt-1);
		if(proposedCombination.getBlacks() == proposedCombination.getWidth()) {	
			Console.getInstance().writeln(Message.PLAYER_WIN.toString());
			return true;
		}
		if(attempt==MAX_ATTEMPTS) {
			Console.getInstance().writeln(Message.PLAYER_LOST.toString());
			return true;
		}
		return false;
	}



}
