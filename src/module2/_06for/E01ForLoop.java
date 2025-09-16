package module2._06for;

public class E01ForLoop {
	
	//Exercise 1: Can you change this code to count from 2 to 10?
	public static void main(String[] args) {
		for(int i = 5; i > 1; i--) {
			for(int j=i; j<10; j=j+2)
			System.out.println("hi");
		}
	}
}
