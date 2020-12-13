package com.escuelait.views.console;

import com.escuelait.models.Game;
import com.escuelait.utils.YesNoDialog;
import com.escuelait.views.Message;

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
