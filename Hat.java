class Hat{
	
	int hatId;
	String brand;
	String colors[];
	String size;
	String type;
	double price;
	
	Hat() {

    }

    Hat(int hatId, String brand){
		this.hatId = hatId;
        this.brand = brand;
	}
	Hat(String colors[], String size, String type){
		this.colors = colors;
        this.size = size;
        this.type = type;
	}
	Hat(double price) {
        this.price = price;
    }
	
  
	
	public void getHatInfo(){
		
		System.out.println("the colors available are");			
			for(String color :colors )
				System.out.println(color);

}
}