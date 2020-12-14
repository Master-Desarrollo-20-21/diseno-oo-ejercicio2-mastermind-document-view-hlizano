package com.escuelait.views;

public enum Message {
	TITLE("--- MASTERMIND ---"),
	ATTEMPTS(" attempt(s):"), 
	SECRET_COMBINATION("****"),
	PROPOSE_COMBINATION("Propose a combination:"), 
	WRONG_PROPOSED_COMBINATION_LENGTH("Wrong proposed combination length"), 
	WRONG_COLORS("Wrong colors, they must be: rbygop"),
	PLAYER_WIN("You've won!!! ;-)"), 
	PLAYER_LOST("You've lost!!! :-("), 
	RESUME("RESUME");

	private String message;
	
	private Message(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return this.message;
	}

}
