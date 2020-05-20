package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {
	

	SkillPractice skills = new SkillPractice();

	skills.skill1();
	skills.skill2();
	skills.skill3();
	skills.skill4();
	//skills.skill5();
}
void skill1() {
	String dimes = JOptionPane.showInputDialog("How many dimes do you have");
	int num = Integer.parseInt(dimes);
	num = num * 10;
	JOptionPane.showMessageDialog(null, "You have "+ num + " cents.");

String inches =	JOptionPane.showInputDialog("How tall are you in inches?");
	int numb = Integer.parseInt(inches);
	if(numb < 36) {
		JOptionPane.showMessageDialog(null, "You need to eat your wheaties!");
	}
}
void skill2() {
	for (int i = 0; i < 31; i++) {
		if (i % 3 == 0) {
		
		System.out.println(i);
	}
	}
	
	
}
void skill3() {
	Random rand = new Random();
	int ran = rand.nextInt(20);
	Random rando = new Random();
	int ra = rando.nextInt(10);
	int difference = ran - ra;
	JOptionPane.showMessageDialog(null, "The difference between "+ ran +" and "+ ra +" is "+ difference + ".");
}
void skill4() {
	String city = JOptionPane.showInputDialog("What city do you live in?");
	if(city.equals("San Diego")) {
		
	}
}
}
