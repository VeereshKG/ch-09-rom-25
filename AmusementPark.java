class AmusementPark{
	
	AmusementPark(){
		System.out.println("the constructor is invoked");
		
	}
	AmusementPark(int parkId,String name,String location,double entryFee,String openingTime,String closingTime){
		System.out.println("the parameterized constructor is invoked");
		this.parkId = parkId;
		this.name = name;
		this.location = location;
		this.entryFee = entryFee;
		this.openingTime = openingTime;
		this.closingTime = closingTime;
		
	}
	
	int parkId;
	String name;
	String location;
	double entryFee;
	String openingTime;
	String closingTime;
	
	public void getAmusementPark(){
	
             System.out.println("the park id is " + parkId);
	         System.out.println("the name is " + name);
    		System.out.println("the location is " + location);
    		System.out.println("the entry fee is " + entryFee);
    		System.out.println("the opening time is " + openingTime);
    		System.out.println("the closing time is " + closingTime);
			System.out.println("");

			
			}
			}