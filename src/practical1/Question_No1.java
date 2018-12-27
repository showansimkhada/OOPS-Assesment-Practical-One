package practical1;

public class Question_No1
{
	
	public static void main(String[] args)
	{
		System.out.println("Student name: Showan Simkhada");
		System.out.println("Student ID: 17459655");
		System.out.println("Pledge of Honour: I pledge by honour that this program is solely my own work.");
		formattingEscapeSequence();
	}	
	
	public static void formattingEscapeSequence()
	{
		System.out.println("Formatting escape sequence:\n");
		// formatting the print
		System.out.printf("%-30s%s\n", "Escape Sequence", "Description");
		System.out.printf("%-30s%s\n", "---------------", "-----------");
		System.out.printf("%-30s%s\n", "\\n", "New line character");
		System.out.printf("%-30s%s\n", "\\t", "Horizontal tab character");
		System.out.printf("%-30s%s\n", "\\\"", "Double quotes character");
	}

}
