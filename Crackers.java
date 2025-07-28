class Crackers{
	
	Crackers(){
		System.out.println("the constructor is invoked");
	}
	
		Crackers(int crackerId, String name, String brand, double price, String type, boolean isLoud) {
		System.out.println("the parameterized constructor is invoked");
			
		this.crackerId = crackerId;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.type = type;
		this.isLoud = isLoud;
		}
	
	int crackerId;
	String name;
	String brand;
	double price;
	String type;
	boolean isLoud;
	
	public void getCrackers(){
		System.out.println("the cracker id is " + crackerId);
		System.out.println("the cracker name is " + name);
		System.out.println("the brand is " + brand);
		System.out.println("the price is " + price);
		System.out.println("the type is " + type);
		System.out.println("is it loud " + isLoud);
		System.out.println("");
	}
}