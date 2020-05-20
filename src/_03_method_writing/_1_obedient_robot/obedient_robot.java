package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedient_robot {
	Robot Robo = new Robot("mini");
	
	
public static void main(String[] args) {
	obedient_robot Bob = new obedient_robot()	;
String shape =	JOptionPane.showInputDialog("What Shape would you like the obedient Robot to draw?");
	
String color = JOptionPane.showInputDialog("Which color would you like your "+ shape + "? Red, Yellow, or Blue?");
if(color.equals("Red")) {
Bob.red();
}
if(color.equals("Blue")) {
Bob.blue();
}
if(color.equals("Yellow")) {
Bob.yellow();
}
if(shape.equals("Square")) {
		Bob.drawSquare();
	}
if(shape.equals("Triangle")) {
	Bob.drawTriangle();
}
if(shape.equals("Circle")) {
	Bob.drawCircle();
}}
void red() {
	Robo.setPenColor(Color.RED);
}
void blue() {
	Robo.setPenColor(Color.BLUE);
}
void yellow() {
	Robo.setPenColor(Color.YELLOW);
}
void drawSquare() {
	for (int i = 0; i < 4; i++) {
		Robo.setSpeed(100);
		Robo.penDown();
		Robo.turn(90);
        Robo.move(100);
	}
	
	}
	void drawTriangle() {
		for (int i = 0; i < 3; i++) {
			Robo.setSpeed(100);
			Robo.penDown();
			Robo.turn(360/3);
			Robo.move(75);
		}
	}
	void drawCircle() {
		for (int i = 0;i < 360; i++) {
			Robo.setSpeed(100);
			Robo.penDown();
			Robo.turn(1);
			Robo.move(1);
		}
	}

}





	