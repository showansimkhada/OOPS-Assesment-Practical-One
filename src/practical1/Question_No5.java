package practical1;

import java.util.Scanner;

public class Question_No5
{
	
	public static void main(String[] args)
	{
		System.out.println("Student name: Showan Simkhada");
		System.out.println("Student ID: 17459655");
		System.out.println("Pledge of Honour: I pledge by honour that this program is solely my own work.");
		collectingAndProcessingAnArrayOfTemperatures();
	}	

	public static void collectingAndProcessingAnArrayOfTemperatures()
	{
		System.out.println("\nCollecting and processing an array of temperatures:\n");
		System.out.print("How many sensors are currently collecting data: ");
		Scanner input = new Scanner(System.in);
		// assuming the user will enter the value l
		int l = input.nextInt();
		double data[] = new double[l];
		double sum = 0;
		// creating the if loop for to read the input equal to the l
		for ( int i = 1; i <= l; i++)
			{
				System.out.print("Enter the temperature #" + i + ": ");
				data[i] = input.nextDouble();
				sum = data[i] + sum;
			}
		input.close();
		double avTemp = sum/l;
		System.out.println("Average temperature :" + avTemp + " out of " + l + " sensors.");
		double maxTemp = 0;
		for (int i = 0; i <= l; i++)
		{
			if(data[i] > maxTemp)
			{
				maxTemp = data[i];
			}
		}
		System.out.printf("%s%.2f", "Maximum temperature : " , maxTemp);
		System.out.println();
		int count = 0;
		for (int i = 0; i <= l; i++)
		{
			if (data[i] > 10 && data[i] < 20)
			{
				count++;
			}
		}
		System.out.println("Number of temperature between 10-20: " + count);
	}
}
