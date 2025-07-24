class ForestSafari{
	
	int safariId;
	String location;
	String guideName;
	int durationInHours;
	String vehicleType;
	double ticketPrice;
	
	public void getForestSafariInfo(){
		System.out.println("the safari id is " + safariId);
		System.out.println("the location is " + location);
		System.out.println("the guide name is " + guideName);
		System.out.println("the duration is " + durationInHours + " hours");
		System.out.println("the vehicle type is " + vehicleType);
		System.out.println("the ticket price is " + ticketPrice);
		
		System.out.println("");
	}
}