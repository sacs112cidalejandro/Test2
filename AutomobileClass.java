import java.util.Scanner;

public class AutomobileClass 

{
	public static void main (String[] args)
	
	{
	int select;
	String selection1;
	Scanner input = new Scanner(System.in);
	
	AutomobileProgram auto = new AutomobileProgram();
	AutomobileProgram cars = new AutomobileProgram();
	
	
	System.out.print("In what year was the car made? ");
	select = input.nextInt();
	auto.CarYear(select);
	System.out.print("What is the car's make?");
	selection1 = input.next();
	auto.CarMake(selection1);
	System.out.print("What is the car's model?");
	selection1 = input.next();
	auto.CarModel(selection1);
	System.out.print("What is the car's color?");
	selection1 = input.next();
	auto.SetColor(selection1);
	System.out.print("What is the car's name?");
	selection1 = input.next();
	auto.SetName(selection1);
	
	System.out.print("How many gears does the car have?");
	select = input.nextInt();
	cars.CarGears(select);
	System.out.print("What is your operating cycle?");
	select = input.nextInt();
	cars.CarCycles(select);
	System.out.print("What is your current gear?");
	select = input.nextInt();
	cars.CurrentGear(select);
	System.out.println("What is your current speed?" + cars.speed());
	System.out.println("What has been the distance you have traveled?" + cars.distance());
	}
}