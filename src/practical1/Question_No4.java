package practical1;

import java.util.Scanner;

public class Question_No4
{
	
	public static void main(String[] args)
	{
		System.out.println("Student name: Showan Simkhada");
		System.out.println("Student ID: 17459655");
		System.out.println("Pledge of Honour: I pledge by honour that this program is solely my own work.");
		cardLetterUserInputValidation();
		//cardLetterUserInputValidation1();
	}	
	
	public static void cardLetterUserInputValidation()
	{
		System.out.println("\nCard letter user input validation:\n");
		Scanner input = new Scanner(System.in);
		// creating variables for all the letters
		String str1 = new String("J");
		String str2 = new String("Q");
		String str3 = new String("K");
		String str4 = new String("A");
		System.out.print("Enter the letter of the card: ");
		// converting the user input to upper case
		String h1 = input.nextLine().toUpperCase();
		System.out.printf("%-20s%s", "Letter", "Message\n");
		// checking whether the input is same as the stored variable or not
		while(!same (str1, h1) && !same (str2, h1) && !same (str3, h1) && !same (str4, h1))
		{
			System.out.printf("%-20S%s", h1, "Error\n");
			System.out.println("Retry");
			System.out.print("Enter the letter of the card: ");
			h1 = input.nextLine().toUpperCase();
			System.out.printf("%-20s%s", "Letter", "Message\n");			
		}	
		if (same (str1, h1.toUpperCase()))
			System.out.printf("%-20S%s", h1, "Jack");
		if (same (str2, h1.toUpperCase()))
			System.out.printf("%-20S%s", h1, "Queen");
		if (same (str3, h1.toUpperCase()))
			System.out.printf("%-20S%s", h1, "King");
		if (same (str4, h1.toUpperCase()))
			System.out.printf("%-20S%s", h1, "Ace");
		input.close();
		
	}
	
	static boolean same (String str1, String str2)
	{
		if (str1.equals(str2))
		{
			return true;
		}
			return false;
	}
	
	public static void cardLetterUserInputValidation1()
	{
		System.out.println("\nCard letter user input validation:\n");
		String letter;
		System.out.print("Enter the letter of the card: ");
		Scanner input = new Scanner(System.in);
		letter = input.nextLine().toUpperCase();
		System.out.printf("%-20s%s", "Letter", "Message\n");
		//Store the value
		
		while(!letter.equals("J") && !letter.equals("Q") && !letter.equals("K") && !letter.equals("A"))
			{
				System.out.printf("%-20S%s", letter, "Error\n");
				System.out.println("Retry");
				System.out.print("Enter the letter of the card: ");
				letter = input.nextLine().toUpperCase();
				System.out.printf("%-20s%s", "Letter", "Message\n");
			}
		switch(letter)
		{
		case "J":
			System.out.printf("%-20S%s", letter, "Jack");
			break;
		case "Q":
			System.out.printf("%-20S%s", letter, "Queen");
			break;
		case "K":
			System.out.printf("%-20S%s", letter, "Jack");
			break;
		case "A":
			System.out.printf("%-20S%s", letter, "Jack");
			break;
		}
		input.close();
	}
}
