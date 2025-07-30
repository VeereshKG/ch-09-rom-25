class Jwellery{
	
	int jwelleryId;
	String type;
	String metal;
	double weight;
	double price;
	String designs[];
	
	
    Jwellery() {

    }

    Jwellery(int jwelleryId, String type, String metal){
		this.jwelleryId = jwelleryId;
        this.type = type;
        this.metal = metal;
	}
	Jwellery(double weight, double price){
		this.weight = weight;
        this.price = price;
	}
	Jwellery(String designs[]) {
        this.designs = designs;
    }

	
	
	
	public void getJwelleryInfo(){
		System.out.println("the designs are");			
			for(String  design: designs)
				System.out.println(design);

		
	}
	}