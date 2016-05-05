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
	

	public void CarYear(int y){
		year = y;
	}
	public void CarMake(String m){
		make = m;
	}
	public void CarModel(String mode){
		model = mode;
	}
	public void CarGears(int g ){
		gears = g;
	}
	public void SetColor(String c)
	{
		color = c;
	}
	public void SetName(String n)
	{
		name = n;
	}
	public void CarCycles(int c){
		cycles = c;
	}
	public void CurrentGear(int x){
		currentGear=x;
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
