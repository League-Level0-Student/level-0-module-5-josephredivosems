package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class prime_or_not {
public static void main(String[] args) {
	String convert = JOptionPane.showInputDialog("What number would you like to know if it is prime or not?");
int prime = Integer.parseInt(convert);	
if(prime % 2 == 0) {
	if(prime == 2) {
		JOptionPane.showMessageDialog(null, "Your number is prime");
	}
	else {
		JOptionPane.showMessageDialog(null, "Your number isn't prime");
	}
}





}
}
