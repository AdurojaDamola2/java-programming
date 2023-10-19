package junit_testing;

public class Calculation2 {
	
	public int addTwoNumbers(int firstNumber, int secondNumber){
		int result = firstNumber + secondNumber;
		System.out.println("The additional sum is:" + result);
		return result;
	}
	
	public int divideTwoNumbers(int firstNumber, int secondNumber){
		int result = firstNumber / secondNumber;
		System.out.println("The division is:" + result);
		return result;
	}
	
	public int multiplyTwoNumbers(int firstNumber, int secondNumber){
		int result = firstNumber * secondNumber;
		System.out.println("The multiplication is:" + result);
		return result;
	}
	
	public int subtractTwoNumbers(int firstNumber, int secondNumber){
		int result = firstNumber - secondNumber;
		System.out.println("The difference is:" + result);
		return result;
	}
	
	public int squareRoot(int firstNumber, int secondNumber){
		int result1 = (int) Math.sqrt (firstNumber);
		int result2 = (int) Math.sqrt (secondNumber);
		System.out.println ("The square root of the first number " + result1);
		System.out.println ("The square root of the second number " + result2);
		
		return result1 & result2;
	}

	public int cubeRoot(int firstNumber, int secondNumber){
		int result1 = (int) Math.cbrt (firstNumber);
		int result2 = (int) Math.cbrt (secondNumber);
		System.out.println ("The cube root of the first number " + result1);
		System.out.println ("The cube root of the second number " + result2);
		
		return result1 & result2;
	}
}
