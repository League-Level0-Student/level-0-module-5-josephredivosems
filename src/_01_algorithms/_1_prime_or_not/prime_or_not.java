package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class prime_or_not {
public static void main(String[] args) {
	String convert = JOptionPane.showInputDialog("What number would you like to know if it is prime or not?");
int prime = Integer.parseInt(convert);	
boolean isPrime = true;
for (int i = 2; i < prime; i++) {
	if(prime % i == 0) {
		isPrime = false;
		
		
		}
	
}
if (isPrime == false) {
	JOptionPane.showMessageDialog(null, "Your number isn't prime");
}
else {
	JOptionPane.showMessageDialog(null, "Your number is prime");
}



}
}
