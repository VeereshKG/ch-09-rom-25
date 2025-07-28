class Coins{
	
		Coins() {
		System.out.println("the constructor is invoked");
	}

	
	Coins(int coinId, String country, String material, int year, double value, String shape) {
		System.out.println("the parameterized constructor is invoked");
		
		this.coinId = coinId;
		this.country = country;
		this.material = material;
		this.year = year;
		this.value = value;
		this.shape = shape;
	}
	
	int coinId;
	String country;
	String material;
	int year;
	double value;
	String shape;
	
	public void getCoinsInfo(){

			System.out.println("the coin id is " + coinId);
		System.out.println("the country is " + country);
		System.out.println("the material is " + material);
		System.out.println("the year is " + year);
		System.out.println("the value is " + value);
		System.out.println("the shape is " + shape);
      System.out.println(" " );
}
}