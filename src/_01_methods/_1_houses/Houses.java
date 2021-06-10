package _01_methods._1_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	Robot rob = new Robot();
	
	public void run() {
		// Check the recipe to find out what code to put here
		Robot.setWindowSize(5000, 1000);
		rob.setY(500);
		rob.setX(0);
		rob.show();
		rob.penDown();
		rob.setSpeed(100);
		rob.setPenColor(Color.blue );
		
		
			for(int i=0;i<9;i++) {
				drawHouse("small");
			
			}
			drawHouse("medium");
			drawHouse("large");
	    }
		void drawHouse(String size) {
			 int height = 50;
			if(size.equalsIgnoreCase("small")) {
				height = 60;
			}
			if(size.equalsIgnoreCase("medium")) {
				
				height = 120;
			}
			if(size.equalsIgnoreCase("large")) {
				
				height = 250;
			}
			for(int i= 0;i<2;i++) {
		    	rob.move(height);
		    	rob.turn(90);
		    }
				rob.move(height);
		    	rob.turn(-90);
		    	rob.move(height);
		    	rob.turn(-90);
		    	
	}
}