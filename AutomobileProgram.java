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
		return currentGear*15;
	}
	public int distance(){
		counter = cycles;
		while (counter !=0){
			currentCycle = (currentGear*15)/30;
			totalDistance = totalDistance + currentCycle;
			counter--;
		}
		return totalDistance;
	}
}
