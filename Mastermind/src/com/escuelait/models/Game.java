package com.escuelait.models;

import com.escuelait.utils.Result;

public class Game {

	private int attempt;
	private SecretCombination secretCombination;
	private ProposedCombination[] proposedCombinations;	
	
	private static final int MAX_ATTEMPTS = 10;
	
	public Game() {
		this.initialize();
	}

	private void initialize() {
		secretCombination = new SecretCombination();
		proposedCombinations = new ProposedCombination[MAX_ATTEMPTS];
		attempt = 0;
	}

	public void processProposedCombination(ProposedCombination proposedCombination) {
		Result result = secretCombination.compareCombination(proposedCombination);
		proposedCombination.setWhites(result.getWhites());
		proposedCombination.setBlacks(result.getBlacks());
		proposedCombinations[attempt] = proposedCombination;
		attempt++;
	}

	public int getAttempt() {
		return attempt;
	}

//	METODO QUE SE USA SÓLO PARA TESTING
//	public String getSecretCombination() { 
//		return this.secretCombination.getColors();}
//
	public ProposedCombination getProposedCombination(int i) {		
		return this.proposedCombinations[i];
	}
	
	public void reset() {
		this.initialize();;		
	}

	public String gameStatus() {

		ProposedCombination proposedCombination = this.getProposedCombination(attempt-1);
		if(proposedCombination.getBlacks() == proposedCombination.getWidth()) {				
			return "WIN";
		}
		if(attempt > MAX_ATTEMPTS) {			
			return "LOOSE";
		}
		return "ONGOING";		
	}

}
