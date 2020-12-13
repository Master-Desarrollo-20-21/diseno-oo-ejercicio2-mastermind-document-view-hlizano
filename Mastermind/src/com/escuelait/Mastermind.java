
package com.escuelait;

import com.escuelait.models.Game;
import com.escuelait.views.GameView;

public abstract class Mastermind {
	
	private Game game;
	private GameView gameView;

	protected Mastermind() {
		this.game = new Game();
		this.gameView = this.createView(game);
	}

	public void play() {
		this.gameView.interact();		
	}

	protected abstract GameView createView(Game game);
}
