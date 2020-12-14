package com.escuelait;

import com.escuelait.models.Game;
import com.escuelait.views.GameView;

public class Mastermind {
	
	private Game game;
	private GameView gameView;

	private Mastermind() {
		this.game = new Game();
		this.gameView = new GameView(this.game);
	}

	private void play() {
		this.gameView.interact();		
	}

	public static void main(String[] args) {
		new Mastermind().play();
	}

}
