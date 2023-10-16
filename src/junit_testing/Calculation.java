package junit_testing;

public class Calculation {
	
	public int squareRoot(int number){
		int result = (int) Math.sqrt (number);
		System.out.println ("The square root is " + result);
		return result;
	}
	
	public int cubeRoot(int number){
		int result = (int) Math.cbrt (number);
		System.out.println ("The cube root is " + result);
		return result;
	}
}
