class Crackers{
	
	int crackerId;
	String name;
	String brands[];
	double price;
	String type;
	boolean isLoud;
	
	Crackers(){
		
	}
	
		Crackers(int crackerId, String name, String brands[]){
			this.crackerId = crackerId;
		    this.name = name;
		    this.brands = brands;
		}
		Crackers(double price, String type){
			this.price = price;
		    this.type = type;
		}
		Crackers(boolean isLoud) {
		this.isLoud = isLoud;
		}
	
	
	
	public void getCrackers(){
		System.out.println("the cracker brand is");			
			for(String  brand:brands )
				System.out.println(brand);
	}
}