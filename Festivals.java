class Festivals{
	
	int festivalId;
    String names[];
    String state;
    String month;
    String type;
	
	Festivals() {

    }

    Festivals(int festivalId){
		this.festivalId = festivalId;
	}
	Festivals(String names[], String state, String month){
		this.names = names;
        this.state = state;
        this.month = month;
	}
	Festivals(String type) {
        this.type = type;
    }
	
	
	
	public void getFestivals(){
		System.out.println("the festival names are");			
			for(String  name: names)
				System.out.println(name);
	}
}