class Rod{
	
	  Rod() {
        System.out.println("the constructor is invoked");
    }

    Rod(int rodId, String material, double length, double weight, String usage, double price) {
        System.out.println("the parameterized constructor is invoked");

        this.rodId = rodId;
        this.material = material;
        this.length = length;
        this.weight = weight;
        this.usage = usage;
        this.price = price;
    }
	
	int rodId;
	String material;
	double length;
	double weight;
	String usage;
	double price;
	
	public void getRodInfo(){
		
		System.out.println("the rod id is " + rodId);
		System.out.println("the material is " +material);
		System.out.println("the length is " + length);
		System.out.println("the weight is " + weight);
		System.out.println("the usage is " + usage);
		System.out.println("the price is " + price);
		System.out.println("");
		
	}
}