class Coins{
	
	int coinId;
	String countrys[];
	String material;
	int year;
	double value;
	String shape;
	
		Coins() {

	}

	
	Coins(int coinId){
		this.coinId = coinId;
	}
	Coins(String countrys[], String material){
		this.countrys = countrys;
		this.material = material;
	} 
	Coins(int year, double value){
		this.year = year;
		this.value = value;
	} 
     Coins(String shape){
		this.shape = shape;
	}
	
	
	
	public void getCoinsInfo(){

		System.out.println("the country are");			
			for(String  country: countrys)
				System.out.println(country);
}
}