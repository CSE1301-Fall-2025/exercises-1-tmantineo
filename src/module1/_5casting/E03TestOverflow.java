package module1._5casting;

public class E03TestOverflow {
	//Exercise 3: These numbers are outside the scope of an int
	//Modify the code to fix the errors
	public static void main(String[] args) {
		int id = 214748365; // overflow error!
		System.out.println(id);
		int negative = -214748365; // overflow
		System.out.println(negative);
	}
}
