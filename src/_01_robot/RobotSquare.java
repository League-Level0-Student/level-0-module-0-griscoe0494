package _01_robot._1_robot_square;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) {
 
    	// 1. Make a new Robot
Robot R2D2 =new Robot();
    	// 3. Put the robot's pen down
R2D2.penDown();
R2D2.setPenColor(255,255,255);    	

        // 6. Make the robot move as fast as possible
R2D2.setSpeed(100);

        // 5. Do everything below here 4 times
for (int i = 0; i < 4; i++) {
	
	

        //         2. Move your robot 200 pixels
R2D2.move(200);

        //         4. Turn the robot 90 degrees to the right (90 degrees)
R2D2.turn(90);

}
	}

	private static void move(int i) {
		// TODO Auto-generated method stub
		
	}

	private static void setSpeed(int i) {
		// TODO Auto-generated method stub
		
	}
}
