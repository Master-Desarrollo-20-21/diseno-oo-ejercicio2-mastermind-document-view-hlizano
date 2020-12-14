package com.escuelait;

import com.escuelait.models.Game;
import com.escuelait.views.GameView;
import com.escuelait.views.console.ConsoleGameView;


public class ConsoleMastermind extends Mastermind{

	@Override
	protected GameView createView(Game game) {		
		return new ConsoleGameView(game);
	}

	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}

}