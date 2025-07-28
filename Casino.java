class Casino{
	
	  Casino() {
        System.out.println("the constructor is invoked");
    }

    Casino(int casinoId, String name, String location, boolean isOpen24Hours, double entryFee) {
        System.out.println("the parameterized constructor is invoked");

        this.casinoId = casinoId;
        this.name = name;
        this.location = location;
        this.isOpen24Hours = isOpen24Hours;
        this.entryFee = entryFee;
    }
	
	int casinoId;
	String name;
	String location;
	boolean isOpen24Hours;
	double entryFee;
	
	public void getCasinoInfo(){
		System.out.println("the casino id is " + casinoId);
		System.out.println("the name is " + name);
		System.out.println("the location is " + location);
		System.out.println("is open 24 hours " +isOpen24Hours);
		System.out.println("the entry fee is " + entryFee);
		System.out.println(" " );
	}
}