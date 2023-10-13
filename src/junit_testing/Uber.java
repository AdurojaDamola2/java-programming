package junit_testing;

public class Uber {
	
	private String driverName;
	
	private String carColor;
	
	private String plateNumber;
	
	public Uber () {}
	
	public int helper (int price) throws Exception {
		firstDriverInformation (price);
		return price;
	}
	
	public String firstDriverInformation(int price) throws Exception {
		driverName = "Azeez";
		carColor = "Silver";
		plateNumber ="yh688KF7uib";
		
		if (price > 3500 || price < 3500){
			throw new Exception ("Price is below my standard");
		}
		else {
			System.out.println ("Booking Successful");
			System.out.println ("Driver name is: " + driverName);
			System.out.println ("Car colour is: " + carColor);
			System.out.println ("Plate number is: " + plateNumber);
			System.out.println ("Price is: " + price);
		}
		System.out.println (driverName + " is coming to pick you");
		return driverName;
	}
}

