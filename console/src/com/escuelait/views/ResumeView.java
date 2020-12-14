package com.escuelait.views;

import com.escuelait.models.Game;
import com.escuelait.models.ProposedCombination;
import com.escuelait.utils.Console;
import com.escuelait.utils.YesNoDialog;

public class ResumeView {
	
	private Game game;

	public ResumeView(Game game) {
	    this.game = game;
	}

	public boolean isResume() {
		boolean resume = new YesNoDialog().read(Message.RESUME.toString());
		if (resume){
			this.game.reset();
		}
		return resume;
	}
}
