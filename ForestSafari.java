class ForestSafari{
	
	 ForestSafari() {
        System.out.println("the constructor is invoked");
    }

    ForestSafari(int safariId, String location, String guideName, int durationInHours, String vehicleType, double ticketPrice) {
        System.out.println("the parameterized constructor is invoked");

        this.safariId = safariId;
        this.location = location;
        this.guideName = guideName;
        this.durationInHours = durationInHours;
        this.vehicleType = vehicleType;
        this.ticketPrice = ticketPrice;
    }
	
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