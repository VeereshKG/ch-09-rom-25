class Blade{
	
	Blade(){
		System.out.println("the constructor is invoked");
	}
	
	Blade(int bladeId,String brand,double price,String type){
		System.out.println("the parameterized constructor is invoked");
		
		this.bladeId =  bladeId;
		this.brand = brand;
		this.price = price;
		this.type = type;
	}
	
	int bladeId;
    String brand;
    double price;
	String type;
	
	public  void getBladeInfo(){
		System.out.println("the blade id is " +bladeId);
		System.out.println("the brand is " + brand);
		System.out.println("the price of blade is " + price);
		System.out.println("the type of blade is " +type);
		System.out.println(" " );

	}
}