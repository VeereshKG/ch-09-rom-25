class Blazzer{
	
	    Blazzer() {
        System.out.println("the constructor is invoked");
    }

    Blazzer(int blazzerId, String color, int size, String brand, double price, String fabric) {
        System.out.println("the parameterized constructor is invoked");

        this.blazzerId = blazzerId;
        this.color = color;
        this.size = size;
        this.brand = brand;
        this.price = price;
        this.fabric = fabric;
    }
	
	int blazzerId;
	String color;
    int size;
    String brand;
    double price;
    String fabric;
	
	public void getBlazzerInfo(){
	System.out.println("the blazzer ID is "+blazzerId);
     System.out.println("the color of blazzer is "+color);
     System.out.println("the size of blazzer is "+size);
     System.out.println("the brand of blazzer is "+brand);
     System.out.println("the price is blazzer is "+price);
     System.out.println("the fabric is "+fabric);
     System.out.println(" " );
	 
	}
    
}