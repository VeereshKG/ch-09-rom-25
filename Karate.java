class Karate{
	
	 Karate() {
        System.out.println("the constructor is invoked");
    }

    Karate(int karateId, String style, String master, String originCountry, boolean isOlympicSport) {
        System.out.println("the parameterized constructor is invoked");

        this.karateId = karateId;
        this.style = style;
        this.master = master;
        this.originCountry = originCountry;
        this.isOlympicSport = isOlympicSport;
    }
	
	int karateId;
	String style;
	String master;
	String originCountry;
	boolean isOlympicSport;
	
	public void getKarateInfo(){
		System.out.println("the karate id is " + karateId);
		System.out.println("the style is " + style);
		System.out.println("the master is " + master);
		System.out.println("the origin country is " + originCountry);
		System.out.println("is olympic sport " + isOlympicSport);
		System.out.println("");
		
	}
}