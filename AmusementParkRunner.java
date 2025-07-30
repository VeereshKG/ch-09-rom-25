class AmusementParkRunner {

	public static void main(String[] park) {

		AmusementPark park1 = new AmusementPark(1,"Wonderla");
		System.out.println("park ID is "+park1.parkId);
		System.out.println("park name is "+park1.name);
		
		AmusementPark park2 = new AmusementPark("Bangalore",1200.0,"11:00am");
		System.out.println("location of park is "+park2.location);
		System.out.println("entryFee of  the park is "+park2.entryFee);
		System.out.println("openingTime of park is "+park2.openingTime);
		
		String games[] = {"Land Thrill","Water Rides","Recoil",};
		
		 AmusementPark park3 = new AmusementPark("7:00pm",games);
		System.out.println("closingTime of park is "+park3.closingTime);
		park3.getAmusementParkInfo();
		
		
	
	}
}