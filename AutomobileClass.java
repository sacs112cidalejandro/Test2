import java.util.Scanner;

public class AutomobileClass 

{
	public static void main (String[] args)
	
	{
	int choice;
	String choice2;
	Scanner input = new Scanner(System.in);
	
	AutomobileProgram auto = new AutomobileProgram();
	AutomobileProgram cars = new AutomobileProgram();
	
	
	System.out.print("In what year was the car made? ");
	choice = input.nextInt();
	auto.CarYear(choice);
	System.out.print("What is the car's make?");
	choice2 = input.next();
	auto.CarMake(choice2);
	System.out.print("What is the car's model?");
	choice2 = input.next();
	auto.CarModel(choice2);
	System.out.print("What is the car's color?");
	choice2 = input.next();
	auto.SetColor(choice2);
	System.out.print("What is the car's name?");
	choice2 = input.next();
	auto.SetName(choice2);
	
	System.out.print("How many gears does the car have?");
	choice = input.nextInt();
	cars.CarGears(choice);
	System.out.print("What is your operating cycle?");
	choice = input.nextInt();
	cars.CarCycles(choice);
	System.out.print("What is your current gear?");
	choice = input.nextInt();
	cars.CurrentGear(choice);
	System.out.println("What is your current speed?" + cars.speed());
	System.out.println("What has been the distance you have traveled?" + cars.distance());
	}
}