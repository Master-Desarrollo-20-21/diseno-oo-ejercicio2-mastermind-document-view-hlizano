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

	public int getAttempts() {
		return attempt;
	}

//	METODO QUE SE USA SÓLO PARA TESTING
//	public String getSecretCombination() { 
//		return this.secretCombination.getColors();}
//
	public ProposedCombination getProposedCombination(int i) {		
		return this.proposedCombinations[i];
	}
	
	public int getMaxAttempts() {
		return MAX_ATTEMPTS;
	}

	public void reset() {
		this.initialize();;		
	}

}
