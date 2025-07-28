class Hat{
	
	Hat() {
        System.out.println("the constructor is invoked");
    }

    Hat(int hatId, String brand, String color, String size, String type, double price) {
        System.out.println("the parameterized constructor is invoked");

        this.hatId = hatId;
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.type = type;
        this.price = price;
    }
	
   int hatId;
	String brand;
	String color;
	String size;
	String type;
	double price;
	
	public void getHatInfo(){
		System.out.println("the hat id is " + hatId);
		System.out.println("the brand is " + brand);
		System.out.println("the color is " +color);
		System.out.println("the size is " + size);
		System.out.println("the type is " + type);
		System.out.println("the price is " + price);
		System.out.println("");
		
}
}