package module2._01ifs;

import java.util.Scanner;
public class E04PizzaCalculatorInput {

	//Exercise 4: Add a check to this program that skips
	//the computations if the number of people is less than
	//or equal to zero
    public static void main(String[] args) {
        int pizzaSlices, numPeople, slicesPerPerson, leftoverSlices;
        Scanner scan = new Scanner(System.in);
        pizzaSlices = scan.nextInt();
        numPeople = scan.nextInt();
        if (numPeople > 0) {
            slicesPerPerson = pizzaSlices / numPeople;
            leftoverSlices = pizzaSlices % numPeople;
            System.out.println("Each person gets: " + slicesPerPerson);
            System.out.println("And there total number of leftover slices is " + leftoverSlices);
        } else {
            System.out.println("Number of people must be greater than zero");
        }
    }

}
