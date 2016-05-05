public class DiceProgram 

{
	private static int randomNum;
	
	public static int OneThrow(int dices){
		randomNum = dices+(int)(Math.random() *(6*dices)-(1-dices));
		return randomNum;
	}
}