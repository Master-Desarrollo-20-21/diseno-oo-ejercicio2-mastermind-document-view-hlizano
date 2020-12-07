package com.escuelait.views;

import com.escuelait.models.Game;
import com.escuelait.models.ProposalCombination;
import com.escuelait.utilis.YesNoDialog;
import com.escuelait.utils.Console;



public class ResumeView extends SubView{

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
