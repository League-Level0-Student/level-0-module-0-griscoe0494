package _01_robot._2_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGrafitti {

    public static void main(String[] args) {
    	Robot R2D2 =new Robot();
    	R2D2.penDown();
    	R2D2.setPenColor(50,90,100);
    	R2D2.setSpeed(50);
    	R2D2.move(200);
    	R2D2.turn(180);
    	R2D2.turn(270);
    	R2D2.move(200);
    	R2D2.turn(180);
    	R2D2.move(200);
    	R2D2.turn(270);
    	R2D2.move(100);
    	R2D2.turn(270);
    	R2D2.move(100);
    	R2D2.turn(180);
    	R2D2.move(100);
    	R2D2.turn(270);
    	R2D2.move(100);
    	R2D2.turn(270);
    	R2D2.move(200);
    }	
}

	//Create a class called RobotGraffiti.
	//Use the Robot to draw the first letter of your name
	//BONUS: Write your entire first name using the Robot