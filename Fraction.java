import java.util.Scanner;

public class Fraction
{
	public static void main(String[] args)
	{
    // declare a scanner object for input
		Scanner scan = new Scanner(System.in);

    // prompt for numerator and read in - use print instead of println so the user will input on the same line as the prompt
		System.out.print("Numerator: ");
		int num1 = scan.nextInt();
    
    // prompt for denomator and read in - use print instead of println so the user will input on the same line as the prompt
		System.out.print("Denomator: ");
		int den1 = scan.nextInt();
    
    // compute the answer and store in a variable of type double
		double answer;
		answer = (num1 / den1);
    
    // ouutput the answer
		System.out.println(answer);
	
    
  }
}
