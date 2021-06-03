package _01_methods._1_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	
	public void run() {
		// Check the recipe to find out what code to put here
		Robot rob = new Robot();
		Robot.setWindowSize(500, 750);
		rob.setY(250);
		rob.show();
		rob.penDown();
		rob.setSpeed(100);
		rob.setPenColor(Color.blue );
	    for(int i= 0;i<3;i++) {
	    	rob.move(100);
	    	rob.turn(90);
	    }
	    	
	    }
		void house() {
		for(int i=0;i<2;i++) {
			run();
		}
	}
}