class Karate{
	
	int karateId;
	String styles[];
	String master;
	String originCountry;
	boolean isOlympicSport;
	
	 Karate() {
 
    }

    Karate(int karateId, String styles[]){
		this.karateId = karateId;
        this.styles = styles;
	}
	Karate(String master, String originCountry){
		this.master = master;
        this.originCountry = originCountry;
	}
	Karate(boolean isOlympicSport) {
        this.isOlympicSport = isOlympicSport;
    }
	
	
	
	public void getKarateInfo(){
		
		System.out.println("the style are");			
			for(String  style:styles )
				System.out.println(style);

	}
}