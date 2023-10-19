package hackerrank;

public class ConditionalActions {
	
	public String getCondition(int number){
		checkForRangeOfSixToTwenty (number);
		checkForRangeOfTwoToFive (number);
		checkGreaterThanTwenty (number);
		checkForOddNumber(number);
		return "";
	}
	
	public void checkForRangeOfSixToTwenty(int number){
		if (number % 2 == 0){
			for (int index = 6; index <= 20; index++){
				System.out.println ("Weird");
			}
		}
	}
	
	public void checkForRangeOfTwoToFive(int number){
		if (number % 2 == 0) {
			for (int index = 2; index <= 5; index++) {
				System.out.println ("Not weird");
				
			}
		}
	}
	
	public void checkForOddNumber(int number){
		if (number % 2 ==1){
			System.out.println ("Weird this is an odd number");
		}
	}
	
	public void checkGreaterThanTwenty(int number){
		if (number > 20){
			System.out.println ("Not weird");
		}
	}
}

