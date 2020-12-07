package com.escuelait;

import com.escuelait.models.Game;
import com.escuelait.views.View;

public class Mastermind {
	
	private Game game;
	private View view;

	public Mastermind() {
		this.game = new Game();
		this.view = new View(this.game);
	}

	public void play() {
		this.view.interact();		
	}

	public static void main(String[] args) {
		new Mastermind().play();
	}

}
