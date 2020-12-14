package com.escuelait.models;

import com.escuelait.utils.Result;

public class SecretCombination extends Combination {
	
	public SecretCombination() {
		for (int i = 0; i < 4; i++) {
			String color = "";
			color += Color.getRandomColor();
			for(int j = 0; j<i; j++) {
				String colorList = String.valueOf(this.colors.charAt(j));
				while(color.equals(colorList)) {
					color = Color.getRandomColor();
				} 		
			}	
			this.colors += color;
		}
	}
	
	public Result compareCombination(Combination proposed) {		
		int whites = 0;
		int blacks = 0;
		for(int i = 0; i<this.getWidth(); i++) {
			char colorProposed = proposed.getColors().charAt(i);
			for(int j = 0; j<this.getWidth(); j++) {	
				char colorSecret = this.colors.charAt(j);
				if(Character.compare(colorProposed, colorSecret) == 0 && i==j) {
					blacks++;
				} else {
					if(Character.compare(colorProposed, colorSecret) == 0 ) {
						whites++;
					}
				}		
			}			
		}		
		return new Result(whites, blacks);		
	}
	
}
