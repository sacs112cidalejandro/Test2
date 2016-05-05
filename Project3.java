import java.util.Scanner;

public class Project3

{
	public static void main (String[] args)
	
	{
	int select;
	String selection1;
	Scanner input = new Scanner(System.in);
	
	AutomobileProgram Truck = new AutomobileProgram(3);
	
	System.out.print("In what year was the car made? ");
	select = input.nextInt();
	Truck.CarYear(select);
	System.out.print("What is the car's make?");
	selection1 = input.next();
	Truck.CarMake(selection1);
	System.out.print("What is the car's model?");
	selection1 = input.next();
	Truck.CarModel(selection1);
	System.out.print("What is the car's color?");
	selection1 = input.next();
	Truck.SetColor(selection1);
	System.out.print("What is the car's name?");
	selection1 = input.next();
	Truck.SetName(selection1);
	Truck.CarCycles();
	Truck.CurrentGear();
	
	System.out.println("Your Speed was: " + Truck.speed());
	System.out.println("Your distance was: " + Truck.distance());
		
	AutomobileProgram Van = new AutomobileProgram(4);
		
	System.out.print("Enter in your car year : ");
	select = input.nextInt();
	Van.CarYear(select);
	System.out.print("Enter in your car make : ");
	selection1 = input.next();
	Van.CarMake(selection1);
	System.out.print("Enter in your car model : ");
	selection1 = input.next();
	Van.CarModel(selection1);
	System.out.print("Enter in your car color : ");
	selection1 = input.next();
	Van.SetColor(selection1);
	System.out.print("Enter in your car name : ");
	selection1 = input.next();
	Van.SetName(selection1);
	Van.CarCycles();
	Van.CurrentGear();

	System.out.println("Your Speed is: " + Van.speed());
	System.out.println("Your distance was: " + Van.distance());

	AutomobileProgram Sport = new AutomobileProgram(6);
	
	System.out.print("Enter in your car year : ");
	select = input.nextInt();
	Sport.CarYear(select);
	System.out.print("Enter in your car make : ");
	selection1 = input.next();
	Sport.CarMake(selection1);
	System.out.print("Enter in your car model : ");
	selection1 = input.next();
	Sport.CarModel(selection1);
	System.out.print("Enter in your car color : ");
	selection1 = input.next();
	Sport.SetColor(selection1);
	System.out.print("Enter in your car name : ");
	selection1 = input.next();
	Sport.SetName(selection1);
	Sport.CarCycles();
	Sport.CurrentGear();

	System.out.println("Your Speed is: " + Sport.speed());
	System.out.println("Your distance was: " + Sport.distance());

	}
}



public class AutomobileProgram 

{
	private int year;
	private String make;
	private String model;
	private String color;
	private String name;
	private int gears;
	private int cycles;
	private int currentGear;
	private int counter;
	private int totalDistance;
	private int currentCycle;
	

	public void CarYear(int o){
		year = o;
	}
	public void CarMake(String n){
		make = n;
	}
	public void CarModel(String mode){
		model = mode;
	}
	public void CarGears(int f ){
		gears = f;
	}
	public void SetColor(String b)
	{
		color = b;
	}
	public void SetName(String p)
	{
		name = p;
	}
	public void CarCycles(int a){
		cycles = a;
	}
	public void CurrentGear(int v){
		currentGear=v;
	}
	public int speed(){
		return currentGear*10;
	}
	public int distance(){
		counter = cycles;
		while (counter !=0){
			currentCycle = (currentGear*10)/60;
			totalDistance = totalDistance + currentCycle;
			counter--;
		}
		return totalDistance;
	}
}


public class DiceProgram 

{
	private static int randomInt;
	
	public static int OneThrow(int dices){
		randomInt = dices+(int)(Math.random() *(6*dices)-(1-dices));
		return randomInt;
	}
}

