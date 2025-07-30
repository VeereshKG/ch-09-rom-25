class Blazzer{
	
	int blazzerId;
	String colors[];
    int size;
    String brand;
    double price;
    String fabric;
	
	
	    Blazzer() {
 
    }

    Blazzer(int blazzerId, String colors[]) {

        this.blazzerId = blazzerId;
        this.colors = colors;
	}
	Blazzer(int size, String brand, double price){
	    this.size = size;
        this.brand = brand;
        this.price = price;	
	}
     Blazzer(String fabric){  
        this.fabric = fabric;
    }
	

	
	public void getBlazzerInfo(){
	System.out.println("the colors are");			
			for(String  color: colors)
				System.out.println(color);
	 
	}
    
}