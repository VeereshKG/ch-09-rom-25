class AmusementPark{
	
	int parkId;
	String name;
	String location;
	double entryFee;
	String openingTime;
	String closingTime;
	String games[];
	
	AmusementPark(){

		
	}
	AmusementPark(int parkId,String name){
		this.parkId = parkId;
		this.name = name;
	}
		
    AmusementPark(String location,double entryFee,String openingTime){
		this.location = location;
		this.entryFee = entryFee;
		this.openingTime = openingTime;
	}
		
	AmusementPark(String closingTime,String games[]){
		this.closingTime = closingTime;
		this.games = games;	
		}
		public void getAmusementParkInfo(){
			System.out.println("the games are");			
			for(String game : games)
				System.out.println(game);				
			}
		
	}

	

	


	
			