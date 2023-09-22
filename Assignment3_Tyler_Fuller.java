package Assignment3_Tyler_Fuller;

import java.util.Scanner;

public class Assignment3_Tyler_Fuller {

	public static void main(String[] args) {
	
		// Declare variables;
		int inventory, numberOfItems;
		int counter = 1;
		double sum = 0;
		double price;
		
		// Get user input for number of items in the store
		System.out.print("How many items in the store? ");
		Scanner input = new Scanner(System.in);
		numberOfItems = input.nextInt();
		
		// User inputs name, inventory, and price; while loop computes sum with each iteration
		while (counter <= numberOfItems) {
			System.out.print("Enter the name, inventory, and price for item " + counter + ": ");
			input.next();
			inventory = input.nextInt();
			price = input.nextDouble();
			sum += (inventory * price);
			counter++;
		}
		input.close();
		
		// Print result to the console
		System.out.printf("Total price of all items = $%.2f", sum);

	}
}