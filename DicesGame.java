import java.util.Scanner;
import java.util.Random;

public class DicesGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		Dices user1 = new Dices();
		
		int choice;
		int totalNumRolled = 0;
		int wins=0;
		
		do{
		System.out.println("How many dices are you rolling? ");
		int timesRolled = input.nextInt();
		
		user1.setRolls(timesRolled);
		user1.trackOfThrows(timesRolled);
		
		int realNumberRolled = user1.numberRolled(timesRolled);
		
		
		
		System.out.println("Take a guess, what's the number? ");
		int guessRolled = input.nextInt();
		user1.saying(realNumberRolled, guessRolled);
		user1.trackOfResults(realNumberRolled, guessRolled);
		
		System.out.println("Let's play another game!! (Y=1/N=0): ");
		choice = input.nextInt();
		}while(choice==1);
		
		user1.sayNumOfThrowsAndWins();
		
		
		
		

	}

}

