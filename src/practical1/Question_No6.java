package practical1;

import java.util.concurrent.*;
import java.util.*;

public class Question_No6
{
	
	public static void main(String[] args)
	{
		System.out.println("Student name: Showan Simkhada");
		System.out.println("Student ID: 17459655");
		System.out.println("Pledge of Honour: I pledge by honour that this program is solely my own work.");
		aGuessingTest();
	}	
	
	public static void aGuessingTest()
	{
		System.out.println("\nA guessing test:\n");
		// storing the data in the arrays
		String[] Country = {"Greece", "Thailand", "China", "Germany", "Netharlands", "Turkey"};
		String[] Capital = {"Athens", "Bangkok", "Beijing", "Berlin", "Amsterdam", "Ankara"};
		// creating the random number from 0 to 5
		int r = ThreadLocalRandom.current().nextInt(0, 6);
		System.out.println("Which country has the capital city "+ Capital[r]);
		System.out.println("Enter up to 3 names, comma-separated: ");
		Scanner input = new Scanner(System.in);
		// storing the string by split function
		String[] guess = input.nextLine().split(",");
		while (guess.length > 3)
		{
			System.out.println("Invalid entry please try again\nEnter up to 3 names, comma-separated: ");
			input = new Scanner(System.in);
			guess = input.nextLine().split(",");
		}
		input.close();
		if(guess[0].equals(Country[r]) || (guess[1].equals(Country[r])) || guess[2].equals(Country[r]))
		{
			System.out.println("The country is " + Country[r]);
			System.out.println("Your answer is correct");
		}
		else
		{
			System.out.println("The country is " + Country[r]);
			System.out.print("Your answer is incorrect");
		}
	}
}
