package com.maven.project.wallpaper;

import java.util.ArrayList;
import java.util.List;

import com.maven.project.wallpaper.calc.Room;

import lombok.val;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Room room = new Room(3,4,2);
        val square = room.squareCalc();
        
        List<Integer> dfdfdEs = new ArrayList<Integer>();
    	
        System.out.println( "Hello World! " + square);
    }
}
