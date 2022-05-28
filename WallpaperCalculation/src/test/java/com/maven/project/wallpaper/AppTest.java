package com.maven.project.wallpaper;


import org.junit.Assert;
import org.junit.Test;

import com.maven.project.wallpaper.calc.Room;

public class AppTest {
	
	@Test
	public void squareCalcShouldEquals() {
		
		Room room = new Room(3, 3, 2);
		Assert.assertEquals(36, room.squareCalc(), 0);
		
	}
	
	@Test
	public void getCountRollBiggerZero() {
		
		Room room = new Room(3, 3, 2);
		Assert.assertEquals(1, room.getCountRoll(), 0);
		
	}
	
	
	
//	@Test
//	public void squareCalcShouldGreaterThanZero() {
//		
//		Room room = new Room(0, 0, 0);
//		Assert.assertEquals(0, room.squareCalc(), 0);
//		
//	}
  
}
