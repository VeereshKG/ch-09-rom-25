class Blade{
	
	int bladeId;
    String brand;
    double price;
	String type;
	String uses[];
	
	Blade(){

	}
	
	Blade(int bladeId,String brand){
		this.bladeId =  bladeId;
		this.brand = brand;
	}
	Blade(double price){
		this.price = price;
	}
	Blade(String type ,String uses[]){	
		this.type = type;
		this.uses = uses;
	}
	

	
	public  void getBladeInfo(){

		System.out.println("the uses are");			
			for(String use  : uses )
				System.out.println(use);

	}
}