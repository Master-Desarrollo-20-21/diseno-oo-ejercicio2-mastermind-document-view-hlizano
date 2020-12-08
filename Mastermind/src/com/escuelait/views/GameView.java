package com.escuelait.views;

import com.escuelait.models.Game;

public class GameView extends View{

	private PlayView playView;
	private ResumeView resumeView;

	public GameView(Game game) {
		super(game);
		this.playView = new PlayView(game);	
		this.resumeView = new ResumeView(game);
	}

	@Override
	public void interact() {
		do {
			this.playView.interact();
		} while (this.resumeView.interact());  //isResumed()?		
	}

}
