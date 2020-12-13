package com.escuelait.models;

public class Combination {
	
	protected String colors;

	private static final int WIDTH = 4;
	public Combination() {
		colors = "";
	}
	
	public Combination(String colors) {
		this.colors = colors;
	}
	
	public String getColors() {
		return colors;
	}
	
    public int getWidth() {
        return Combination.WIDTH;
    }
}
