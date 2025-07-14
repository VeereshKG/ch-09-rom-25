class ParkRunner{
	
	public static void main(String[] run){
		
	String name	= Park.parkName();
	System.out.println("the park name is :"+name);
	
	String location  = Park.area();
	System.out.println("the location of Park :"+location);
	
	boolean  water = Park.isWaterFacility();
	System.out.println("is water available in park:"+water);
	
	boolean  track= Park.running();
	System.out.println("is running Track :"+track);
	
	boolean room = Park.isRestrooms();
	System.out.println("is rest Rooms available :"+room);
	
	}
	
	
}
