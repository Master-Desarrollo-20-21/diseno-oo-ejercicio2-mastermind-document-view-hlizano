package com.escuelait.views;

import com.escuelait.models.Game;

public abstract class GameView extends View{

	protected GameView(Game game) {
		super(game);
	}

	@Override
	public void interact() {
		do {
			this.play();
		} while (this.isResume());
	}
		
    protected abstract void play();

    protected abstract boolean isResume();

}
