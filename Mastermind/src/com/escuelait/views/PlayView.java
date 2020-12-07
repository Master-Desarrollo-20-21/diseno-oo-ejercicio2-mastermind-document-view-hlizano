package com.escuelait.views;

import com.escuelait.models.Game;
import com.escuelait.utils.Console;
import com.escuelait.models.ProposalCombination;

public class PlayView extends SubView{

	public PlayView(Game game) {
		super(game);
	}
	
    void interact() {
    	do {
    		new GameView(this.game).write();
    		ProposalCombination proposalCombination = new ProposalCombinationView().read(Message.PROPOSE_COMBINATION.toString());	// board.getNewProposalCombination()
			game.setProposalColors(proposalCombination.getColors());
			game.processProposalCombination();								// board.processProposalCombination();
    	}while(!this.gameEnded());		
	}

	private boolean gameEnded() {
		int attempt = this.game.getAttempts();
		int MAX_ATTEMPTS = this.game.getMaxAttempts();
		ProposalCombination proposalCombination = this.game.getProposalCombination(attempt-1);
		if(proposalCombination.getBlacks()== 4) {	
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
