package practical1;

import java.util.Scanner;

public class Question_No7 
{
	
	public static void main(String[] args)
	{
		System.out.println("Student name: Showan Simkhada");
		System.out.println("Student ID: 17459655");
		System.out.println("Pledge of Honour: I pledge by honour that this program is solely my own work.");
		Question_No7.countTheIntersectionOfTwoArray();
	}	
	
	public static void countTheIntersectionOfTwoArray()
	{
		System.out.println("\nCount the intersection of two array:\n");
		System.out.print("Enter the first line of comma-separated numbers: ");
		Scanner input = new Scanner(System.in);
		String[] first = input.nextLine().split(",");
		System.out.print("Enter the second line of comma-separated numbers: ");
		String[] second = input.nextLine().split(",");
		while(first.length == second.length)
		{
			System.out.println("Please enter the line with different length\nEnter the first line of comma-separated numbers: ");
			input = new Scanner(System.in);
			first = input.nextLine().split(",");
			System.out.println("Enter the second line of comma-separated numbers: ");
			second = input.nextLine().split(",");
		}
		input.close();
		int firstLength = first.length;
		int secondLength = second.length;
		double[] array1 = new double[firstLength];
		double[] array2 = new double[secondLength];
		for (int i = 0; i < array1.length;)
			for (int j = 0; j < first.length; j++)
			{
				// storing the values from the string arrays to double array with nested loops
				array1[i] = Double.parseDouble(first[j]);
				i++;
			}
		
		
		for (int i = 0; i < array2.length;)
		{
			for (int j = 0; j < second.length; j++)
			{
				array2[i] = Double.parseDouble(second[j]);
				i++;
			}
		}
		int count = 0;
		for (double d1 : array1)
		{
			for (double d2 : array2)
			{
				// using nested loop to count the overlapped elements inn the array
				if(d1 == d2)
				{
					count++;
				}
			}
		}
		System.out.println("The number of ovelapping numbers: " + count);	
	}
}
