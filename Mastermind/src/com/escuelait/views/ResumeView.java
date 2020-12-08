package com.escuelait.views;

import com.escuelait.models.Game;
import com.escuelait.models.ProposedCombination;
import com.escuelait.utils.Console;
import com.escuelait.utils.YesNoDialog;

public class ResumeView extends View{

	public ResumeView(Game game) {
		super(game);
	}

	public boolean interact() {
		boolean isResumed = new YesNoDialog().read(Message.RESUME.toString());
		if (isResumed){
			this.game.reset();
		}
		return isResumed;
	}

}
