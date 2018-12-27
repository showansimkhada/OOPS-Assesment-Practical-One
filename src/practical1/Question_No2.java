package practical1;

import java.util.Scanner;

public class Question_No2 
{
	
	public static void main(String[] args)
	{
		System.out.println("Student name: Showan Simkhada");
		System.out.println("Student ID: 17459655");
		System.out.println("Pledge of Honour: I pledge by honour that this program is solely my own work.");
		cicleArithmeticCalculation();
	}	
	
	public static void cicleArithmeticCalculation()
	{
		System.out.println("\nCircle arithmetic calculation:\n");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a radius: ");
		// reading the data from the user and storing to the radius
		double radius = input.nextDouble();
		input.close();
		System.out.printf("%-10s%-10s%s\n", "Radius", "Area", "Perimeter");
		System.out.printf("%-10s%-10s%s\n", "------", "----", "---------");
		double Area = radius * radius * Math.PI;
		double Perimeter = radius * 2 * Math.PI;
		System.out.printf("%-10.2f%-10.2f%.2f\n", radius, Area, Perimeter);
	}
}