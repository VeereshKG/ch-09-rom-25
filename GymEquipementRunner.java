class GymEquipementRunner {

    public static void main(String[] gym) {

        GymEquipement ref1 = new GymEquipement(1, "Treadmill");
        System.out.println("the equipment id is " + ref1.equipmentId);
		System.out.println("the name is " + ref1.name);
		
		GymEquipement ref2 = new GymEquipement("FitKing", 50000.0, "Cardio");
		System.out.println("the brand is " + ref2.brand);
		System.out.println("the price of equipment is " +ref2. price);
		System.out.println("the type is " + ref2.type);
		
		double weights[] = {50.0,100.0,70.0};
		GymEquipement ref3 = new GymEquipement(weights);
		ref3.getGymEquipementInfo();
		
    
    }
}
