class ForestSafariRunner {

    public static void main(String[] forest) {

        ForestSafari ref1 = new ForestSafari(1, "Bandipur", "Ramesh");
        System.out.println("the safari id is " + ref1.safariId);
		System.out.println("the location is " + ref1.location);
		System.out.println("the guide name is " + ref1.guideName);
		
		ForestSafari ref2 = new ForestSafari(3, "Van");
		System.out.println("the duration is " + ref2.durationInHours + " hours");
		System.out.println("the vehicle type is " +ref2. vehicleType);
		
		ForestSafari ref3 = new ForestSafari(1800.0);
		System.out.println("the ticket price is " + ref3.ticketPrice);
      
    }
}
