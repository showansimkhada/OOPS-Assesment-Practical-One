package practical1;

import java.util.Scanner;

public class Question_No8 
{
	public static void main(String[] args)
	{
		System.out.println("Student name: Showan Simkhada");
		System.out.println("Student ID: 17459655");
		System.out.println("Pledge of Honour: I pledge by honour that this program is solely my own work.");
		arrayOperations();
	}	
	
	public static void arrayOperations()
	{
		System.out.println("\nArray operations:\n");
		System.out.print("Enter a line of comma-separated temperatures: ");
		Scanner input = new Scanner(System.in);
		String[] line = input.nextLine().split(",");
		input.close();
		int lineLength = line.length;
		double[] array = new double[lineLength];
		for(int i = 0; i < array.length;)
		{
			for (int j = 0; j < line.length; j++)
			{
				array[i] = Double.parseDouble(line[j]);
				i++;
			}
		}
		
		double sum = 0;
		for (int i = 0; i < array.length; i++)
		{
			sum = sum + array[i];
		}
		
		double av = sum/array.length;
		System.out.printf("%s%.2f", "Average temperature: ", av);
		// assuming the max value as zero
		double max = 0;
		for (int i = 0; i < array.length; i++)
		{
			if(max < array[i])
			{
				max = array[i];
			}
		}
		System.out.printf("%s%.2f", "\nMaximum temperature: ", max);
		
		int count = 0;
		for (int i = 0; i < array.length; i++)
		{
			if(array[i] > 0 && array[i] <= 10)
			{
				count++;
			}
		}
		System.out.print("\nThere are " + count + " temperatures between 0-10.");
	}
}
