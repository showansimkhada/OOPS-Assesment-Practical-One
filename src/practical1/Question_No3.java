package practical1;

import java.util.*;

public class Question_No3 
{
	
	public static void main(String[] args)
	{
		System.out.println("Student name: Showan Simkhada");
		System.out.println("Student ID: 17459655");
		System.out.println("Pledge of Honour: I pledge by honour that this program is solely my own work.");
		determineGrade();
	}	
	
	public static void determineGrade()
	{
		System.out.println("\nDetermine grade:\n");
		System.out.print("Enter the Grade: ");
		Scanner input = new Scanner(System.in);
		double score = input.nextDouble();
		input.close();
		System.out.printf("\n%-30s%s\n", "Score","Grade");
		// if the score is below 0 and above 100 it will print error
		if (score < 0 || score > 100) 
		{
			System.out.printf("%-30s%s\n", score, "Error");
		}
		else if (score < 50 && score >= 0) 
		{
			System.out.printf("%-30s%s\n", score, "D");
		}
		else if (score >= 50 && score < 70) 
		{
			System.out.printf("%-30s%s\n", score, "C");
		}
		else if (score >= 70 && score < 80) 
		{
			System.out.printf("%-30s%s\n", score, "B");
		}
		else
		{
			System.out.printf("%-30s%s\n", score, "A");
		}
	}
}