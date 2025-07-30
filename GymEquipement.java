class GymEquipement{
	
	int equipmentId;
	String name;
	String brand;
	double price;
	String type;
	double weights[];
	
	    GymEquipement() {

    }

    GymEquipement(int equipmentId, String name){
		this.equipmentId = equipmentId;
        this.name = name;
	}
	GymEquipement(String brand, double price, String type){
		this.brand = brand;
        this.price = price;
        this.type = type;
	}
	GymEquipement(double weights[]) {
        this.weights = weights;
    }
	
	
	

  public  void getGymEquipementInfo() {
    	System.out.println("the weights are ");			
			for(double  weight: weights)
				System.out.println(weight);
    }
}


