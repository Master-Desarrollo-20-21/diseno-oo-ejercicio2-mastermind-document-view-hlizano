package com.escuelait.views.console;

import com.escuelait.models.Game;
import com.escuelait.views.GameView;

public class ConsoleGameView extends GameView{

    private PlayView playView;
	private ResumeView resumeView;
	
	public ConsoleGameView(Game game) {
		super(game);
		this.playView = new PlayView(game);	
		this.resumeView = new ResumeView(game);
	}

    @Override
    protected void play() {
        this.playView.interact();
    }

    @Override
    protected boolean isResume() {
        return this.resumeView.isResume();
    }    
}
