package com.escuelait.views;

import com.escuelait.models.Game;

public abstract class View {
	  protected Game game;

	  protected View(Game game) {
	    this.game = game;
	  }
	  
	  public abstract void interact();
}
