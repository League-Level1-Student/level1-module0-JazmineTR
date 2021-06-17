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
		
		
			for(int i=0;i<4;i++) {
				drawPointyRoof("small");
				drawPointyRoof("medium");
				drawFlatRoof("large");
			}
	    }
		void drawFlatRoof(String size) {
			 int height = 50;
			 
			if(size.equalsIgnoreCase("large")) {
				
				height = 250;
				rob.setPenColor(Color.green);
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
		void drawPointyRoof(String size) {
			int height = 50;
			 
			if(size.equalsIgnoreCase("small")) {
				height = 60;
				rob.setPenColor(Color.yellow);
			}
			if(size.equalsIgnoreCase("medium")) {
				
				height = 120;
				rob.setPenColor(Color.blue);
			}
			
			rob.move(height);
	    	rob.turn(45);
	        rob.move(height);
	    	rob.turn(45);
	    	rob.turn(45);
	    	rob.move(height);
	    	rob.turn(45);
	    	rob.move(height);
	    	rob.turn(-90);
	    	rob.move(height);
	    	rob.turn(-90);
		}
}