package com.escuelait.models;

public class Game {

	private Board board;

	public Game() {
		board = new Board();
	}
	
	public Board getBoard() {
		return board;
	}
	
	public int getAttempts() {
		return board.getAttempts();
	}
	
	public String getSecretCombination(){ 
		return board.getSecretCombination();
	}

	public ProposalCombination getProposalCombination(int i) {		
		return board.getProposalCombination(i);
	}

	public void setProposalColors(String colors) {
		board.setColors(colors);		
	}

	public void processProposalCombination() {
		board.processProposalCombination();		
	}

	public int getMaxAttempts() {
		return board.getMaxAttempts();
	}

	public void reset() {
		board = new Board();		
	}

}
