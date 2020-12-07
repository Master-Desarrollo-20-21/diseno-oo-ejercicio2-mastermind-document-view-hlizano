package com.escuelait.views;

import com.escuelait.utils.Console;

enum Message {
	TITLE("--- MASTERMIND ---"),
	ATTEMPTS(" attempt(s):"), 
	TOOLTIP("  <-- xxxx secret for tests"),
	PROPOSE_COMBINATION("Propose a combination:"), 
	WRONG_PROPOSED_COMBINATION_LENGTH("Wrong proposed combination length"), 
	WRONG_COLORS("Wrong colors, they must be: rbygop"),
	PLAYER_WIN("You've won!!! ;-)"), 
	PLAYER_LOST("You've lost!!! :-("), 
	RESUME("RESUME? (y/n): ");

	private String message;
	
	private Message(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return this.message;
	}

}
