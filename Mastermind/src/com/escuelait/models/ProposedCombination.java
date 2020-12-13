package com.escuelait.models;

public class ProposedCombination extends Combination {

	private int whites;
	private int blacks;
	
	public ProposedCombination(String colors, int blacks, int whites) {
		this.colors = colors;
		this.blacks = blacks;
		this.whites = whites;
	}

	public ProposedCombination() {
		this.colors = "";
		this.blacks = 0;
		this.whites = 0;
	}

	public int getWhites() {
		return this.whites;
	}
	
	public int getBlacks() {
		return this.blacks;
	}
	
	public void setWhites(int whites) {
		this.whites = whites;
	}
	
	public void setBlacks(int blacks) {
		this.blacks = blacks;
	}
	
	public void setProposedCombinationColors(String colors) {
		this.colors = colors;
	}

	public boolean isWinner() {
		return this.getBlacks() == this.getWidth();				
	}
}
