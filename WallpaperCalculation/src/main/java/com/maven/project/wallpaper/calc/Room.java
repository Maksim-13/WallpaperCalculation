package com.maven.project.wallpaper.calc;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Room {

	private int hight;
	private int length;
	private int width;

	public int squareCalc() {
		return hight * 2 * (length * width);
	}
	
	public int getCountRoll() {
		
		
		return 1;
		
	}

}
