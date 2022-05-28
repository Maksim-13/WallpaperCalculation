package com.maven.project.wallpaper;

import lombok.Data;

@Data
public class Square {
	
	private int hight;
	private int length;
	
	
	public int squareCalc(){
		
		
		return hight*length;
		
	}

}
