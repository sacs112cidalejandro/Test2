import java.util.Scanner;

public class DiceClass 
{
	
	public static void main (String[] args)
	{
		DiceProgram Dice = new DiceProgram();
		int picked;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of dice you would like to throw: ");
		picked = input.nextInt();
		
		System.out.println("Your total is: " + Dice.OneThrow(picked));
	}
}
