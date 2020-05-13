package _02_nested_loops._3_for_loop_gauntlet;

public class loop_gauntlet {
public static void main(String[] args) {
	
	for (int i = 1; i < 101; i++) {
		System.out.println(i);
	}
	for (int i = 100; i > 0; i--) {
		System.out.println(i);
	}
	for (int i = 2; i < 101; i++) {
		if(i % 2 == 0) {
		System.out.println(i);
		}
	}
	for (int i = 1; i < 100; i++) {
		if(i % 2 == 0) {
			
		}
		else {
			System.out.println(i);
		}
	}
	for (int i = 1; i < 501; i++) {
		if(i % 2 == 0) {
			System.out.println(i + " is even");
		}
		else {
			System.out.println(i + " is odd");
		}
	}
	int k = 0;
	int l = 0;
	for (int i = 0; i < 3; i++) {
		
	
	for (int j = 0; j < 3; j++) {
		System.out.println(k + " " + l);
		l+=1;
	}
	l-=3; 
	k+=1;
	}
	int numOne = 0;
	int numTwo = 0;
	int numThree = 0;
	for (int i = 0; i < 3; i++) {
		numOne+=1;
		numTwo = numOne + 1;
		numThree = numTwo + 1;
		System.out.println(numOne + " " + numTwo + " " + numThree);
		numOne = numThree;
	}
	
	int o = 0;
	for (int i = 0; i < 10; i++) {
		String storer = "";
		for (int j = 1; j < 11; j++) {
			o+=1;
			storer+=o;
			
		}
		System.out.println(storer);
		
	}
	String storer = "*";
	for (int i = 0; i < 7; i++) {
		
		System.out.println(storer);
		storer+=" *";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
