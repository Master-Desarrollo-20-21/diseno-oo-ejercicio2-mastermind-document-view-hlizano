package com.escuelait.models;

public class Board {
	private int attempt;
	String colors;
	private SecretCombination secretCombination;
	private ProposalCombination[] proposalCombinations;	
	
	private static final int MAX_ATTEMPTS = 10;

	
	public Board() {
		secretCombination = new SecretCombination();
		proposalCombinations = new ProposalCombination[MAX_ATTEMPTS];
		attempt = 0;
		colors = "";
	}

	public void processProposalCombination() {
		int whites = 0, blacks = 0;
		for(int i = 0; i<4; i++) {
			char colorProposal = colors.charAt(i);

			for(int j = 0; j<4; j++) {	
				char colorSecret = secretCombination.colors.charAt(j);
				if(Character.compare(colorProposal, colorSecret) == 0 && i==j) {
					blacks++;
				} else {
					if(Character.compare(colorProposal, colorSecret) == 0 ) {
						whites++;
					}
				}		
			}			
		}
		proposalCombinations[attempt] = new ProposalCombination(colors, blacks, whites);
		attempt++;
	}

	public int getAttempts() {
		return attempt;
	}
	
	public String getSecretCombination() { 
		return this.secretCombination.getColors();}

	public ProposalCombination getProposalCombination(int i) {		
		return this.proposalCombinations[i];
	}

	public void setColors(String colors) {
		this.colors = colors;		
	}
	
	public int getMaxAttempts() {
		return MAX_ATTEMPTS;
	}
}

