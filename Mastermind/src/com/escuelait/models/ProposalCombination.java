package com.escuelait.models;

public class ProposalCombination extends Combination {

	private int whites;
	private int blacks;
	
	public ProposalCombination(String colors, int blacks, int whites) {
		this.colors = colors;
		this.blacks = blacks;
		this.whites = whites;
	}

	public ProposalCombination() {
		this.colors = "";
		this.blacks = 0;
		this.whites = 0;
	}

	@Override
	public String toString() {
		return colors + " --> " + blacks + " blacks " + "and " + whites + " whites";
	}

	public int getBlacks() {
		return this.blacks;
	}
	
	public void setColors(String colors) {
		this.colors = colors;
	}
}
