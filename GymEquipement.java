class GymEquipement{
	
	    GymEquipement() {
        System.out.println("the constructor is invoked");
    }

    GymEquipement(int equipmentId, String name, String brand, double price, String type, double weight) {
        System.out.println("the parameterized constructor is invoked");

        this.equipmentId = equipmentId;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.type = type;
        this.weight = weight;
    }
	
	int equipmentId;
	String name;
	String brand;
	double price;
	String type;
	double weight;
	

  public  void getGymEquipementInfo() {
    	System.out.println("the equipment id is " + equipmentId);
		System.out.println("the name is " + name);
		System.out.println("the brand is " + brand);
		System.out.println("the price of equipment is " + price);
		System.out.println("the type is " + type);
		System.out.println("the weight is " + weight);
        System.out.println("");
    }
}


