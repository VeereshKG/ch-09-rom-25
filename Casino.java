class Casino{
	
	int casinoId;
	String names[];
	String location;
	boolean isOpen24Hours;
	double entryFee;
	
	  Casino() {

    }

    Casino(int casinoId){
		this.casinoId = casinoId;
	}
	Casino(String names[], String location){
		this.names = names;
        this.location = location;
	}
    Casino(boolean isOpen24Hours, double entryFee){ 
        this.isOpen24Hours = isOpen24Hours;
        this.entryFee = entryFee;
    }
	
	
	
	public void getCasinoInfo(){
		System.out.println("the names of casino are");			
			for(String  name: names)
				System.out.println(name);
		
	}
}