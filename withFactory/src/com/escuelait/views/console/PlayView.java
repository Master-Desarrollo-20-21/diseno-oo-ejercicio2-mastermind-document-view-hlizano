package com.escuelait.views.console;

import com.escuelait.models.Game;
import com.escuelait.utils.Console;
import com.escuelait.views.Message;
import com.escuelait.views.View;
import com.escuelait.models.ProposedCombination;

public class PlayView extends View{

	public PlayView(Game game) {
		super(game);
	}
	
	@Override
	public void interact() {
		Console.getInstance().writeln(Message.TITLE.toString());
	    do {
			new AttemptView(this.game).write();
			ProposedCombination proposedCombination = new ProposedCombinationView().read(Message.PROPOSE_COMBINATION.toString());	
			game.processProposedCombination(proposedCombination);
		}while(!this.isGameEnded());
	}

	private boolean isGameEnded() {
		
		String status = game.gameStatus();
		if(status.equals("WIN")) {	
			Console.getInstance().writeln(Message.PLAYER_WIN.toString());
			return true;
		}
		if(status.equals("LOOSE")) {
			Console.getInstance().writeln(Message.PLAYER_LOST.toString());
			return true;
		}
		return false;
	}
}
