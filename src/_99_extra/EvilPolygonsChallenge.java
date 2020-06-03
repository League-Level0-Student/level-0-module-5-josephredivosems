package _99_extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob = new Robot("mini");
		//2. Set the speed to 100
		rob.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "Choose a Color", "Color Choice", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Red","Blue", "Yellow"}, 0);
		rob.penDown();
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if(colorChoice == 0) {
			rob.setPenColor(Color.RED);
		}
		else if(colorChoice == 1) {
			rob.setPenColor(Color.BLUE);
		}
		else if(colorChoice == 2) {
			rob.setPenColor(Color.YELLOW);
		}
		//4. Ask the use how many polygons they want to be drawn.
		String polygons = JOptionPane.showInputDialog("How many polygons would you like to draw?");
		//5. Use the robot to draw the number of polygons the user requested.
		int evil = Integer.parseInt(polygons);
		int counter = 0;
		for (evil = evil;counter  < evil; counter++) {
			rob.move(10);
			rob.turn(90);
			rob.move(10);
			rob.turn(90);
			rob.move(10);
			rob.turn(90);
			rob.move(20);
			rob.turn(90);
		}
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

