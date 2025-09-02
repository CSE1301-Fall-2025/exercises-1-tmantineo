package module1._6boolean;

public class E03BooleanMod {

	//Exercise 3: Try to predict the result before running the code.
	//Use the debugger to step through and understand what is happening.
	public static void main(String[] args) {
		int age1 = 15;
		int age2 = 16;
		int divisor = 2;
		System.out.println("Remainder of " + age1 + "/" + divisor + " is " + (age1 % divisor) );
		// Remainder of 15/2 is 1
		System.out.println("Remainder of " + age2 + "/" + divisor + " is " + (age2 % divisor) );
		// Remainder of 16/2 is 0
		System.out.println("Is " + age1 + " even? " + (age1 % 2 == 0) );
		// Is 15 even false
		System.out.println("Is " + age2 + " even? " + (age2 % 2 == 0) );
		// Is 16 even, true
	}
}
