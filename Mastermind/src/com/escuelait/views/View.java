package com.escuelait.views;

import com.escuelait.models.Game;


public class View {

    private Game game;
	private PlayView playView;
	private ResumeView resumeView;

	public View(Game game) {
		this.game = game;
		this.playView = new PlayView(this.game);	// board.show(), board.getNewProposalCombination(), board.processProposalCombination();
		this.resumeView = new ResumeView(this.game);// board.gameEnded()
	}

	public void interact() {
		do {
			this.playView.interact();
		} while (this.resumeView.interact());
	}

}
