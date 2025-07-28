class Jwellery{
	
	
    Jwellery() {
        System.out.println("the constructor is invoked");
    }

    Jwellery(int jwelleryId, String type, String metal, double weight, double price, String design) {
        System.out.println("the parameterized constructor is invoked");

        this.jwelleryId = jwelleryId;
        this.type = type;
        this.metal = metal;
        this.weight = weight;
        this.price = price;
        this.design = design;
    }

	
	int jwelleryId;
	String type;
	String metal;
	double weight;
	double price;
	String design;
	
	public void getJwelleryInfo(){
		System.out.println("the jwelleryId is"+jwelleryId);
		System.out.println("the type is " + type);
		System.out.println("the metal is " + metal);
		System.out.println("the weight is " +weight);
		System.out.println("the price is " + price);
		System.out.println("the design is " + design);
		System.out.println("");
		
	}
	}