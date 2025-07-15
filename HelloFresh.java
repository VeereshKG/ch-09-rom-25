class HelloFresh{
	
	public static double search(String juiceName){
		double price = 0.0;
		
		if(juiceName == "Orange"){
			price = 150.0;
			return price;
		}
		else if(juiceName == "Apple"){
			price = 160.0;
			return price;
		}
		else if(juiceName == "Pineapple"){
			price = 120.0;
			return price;
		}
		else if(juiceName == "CranBerry"){
			price = 99.0;
			return price;
		}
		else if(juiceName == "GrapeFruit"){
			price = 100.0;
			return price;
		}
		else if(juiceName == "Pomegrante"){
			price = 160.0;
			return price;
		}
		else if(juiceName == "watermelon"){
			price = 55.0;
			return price;
		}
		else if(juiceName == "Coconut"){
			price = 65.0;
			return price;
		}
		else if(juiceName == "grape"){
			price = 70.0;
			return price;
		}
		else if(juiceName == "SugarCane"){
			price = 120.0;
			return price;
		}
		else if(juiceName == "Beet"){
			price = 99.0;
			return price;
		}
		else if(juiceName == "Bluebeery"){
			price = 67.0;
			return price;
		}
		else if(juiceName == "Cherry"){
			price = 78.0;
			return price;
		}
		else if(juiceName == "lemon"){
			price = 99.9;
			return price;
		}
		else if(juiceName == "carrot"){
			price = 100;
			return price;
		}
		else if(juiceName == "celery"){
			price = 150;
			return price;
		}
		else if(juiceName == "vegetable"){
			price = 170;
			return price;
		}
		else if(juiceName == "kiwi"){
			price = 80;
			return price;
		}
		else if(juiceName == "Strawberry"){
			price = 40;
			return price;
		}
		else if(juiceName == "wheetGrass"){
			price = 70;
			return price;
		}
		else if(juiceName == "Cantaloupe"){
			price = 180;
			return price;
		}
		else if(juiceName == "mosambi"){
			price = 40;
			return price;
		}
		else if(juiceName == "jal jeera"){
			price = 35;
			return price;
		}
		else if(juiceName == "AamPanna"){
			price = 89.0;
			return price;
		}
		else if(juiceName == "Avocado"){
			price = 100;
			return price;
		}
		else if(juiceName == "Calamansi"){
			price = 150;
			return price;
		}
		else if(juiceName == "Gooseberry"){
			price = 79.0;
			return price;
		}
		else if(juiceName == "Guava"){
			price = 55.0;
			return price;
		}
		else if(juiceName == "papya"){
			price = 45.0;
			return price;
		}
		else if(juiceName == "Raspberry"){
			price = 70.0;
			return price;
		}
		
		else System.out.println("the entered juice price is not available");
			return price;
}
	
   public 	static double search(String juiceName,int quantity){
		double price = 0.0;
		
		if(juiceName == "Orange"){
			price = 150.0 * quantity;
			return price;
		}
		else if(juiceName == "Apple"){
			price = 160.0 * quantity;
			return price;
		}
		else if(juiceName == "Pineapple"){
			price = 120.0 * quantity;
			return price;
		}
		else if(juiceName == "CranBerry"){
			price = 99.0 * quantity ;
			return price;
		}
		else if(juiceName == "GrapeFruit"){
			price = 100.0 * quantity;
			return price;
		}
		else if(juiceName == "Pomegrante"){
			price = 160.0 * quantity;
			return price;
		}
		else if(juiceName == "watermelon"){
			price = 55.0 * quantity;
			return price;
		}
		else if(juiceName == "Coconut"){
			price = 65.0 * quantity;
			return price;
		}
		else if(juiceName == "grape"){
			price = 70.0 * quantity;
			return price;
		}
		else if(juiceName == "SugarCane"){
			price = 120.0 * quantity;
			return price;
		}
		else if(juiceName == "Beet"){
			price = 99.0 * quantity;
			return price;
		}
		else if(juiceName == "Bluebeery"){
			price = 67.0 * quantity;
			return price;
		}
		else if(juiceName == "Cherry"){
			price = 78.0 * quantity;
			return price;
		}
		else if(juiceName == "lemon"){
			price = 99.9 * quantity;
			return price;
		}
		else if(juiceName == "carrot"){
			price = 100 * quantity;
			return price;
		}
		else if(juiceName == "celery"){
			price = 150 * quantity;
			return price;
		}
		else if(juiceName == "vegetable"){
			price = 170 * quantity;
			return price;
		}
		else if(juiceName == "kiwi"){
			price = 80 * quantity;
			return price;
		}
		else if(juiceName == "Strawberry"){
			price = 40 * quantity;
			return price;
		}
		else if(juiceName == "wheetGrass"){
			price = 70 * quantity;
			return price;
		}
		else if(juiceName == "Cantaloupe"){
			price = 180 * quantity;
			return price;
		}
		else if(juiceName == "mosambi"){
			price = 40 * quantity;
			return price;
		}
		else if(juiceName == "jal jeera"){
			price = 35 * quantity;
			return price;
		}
		else if(juiceName == "AamPanna"){
			price = 89.0 * quantity;
			return price;
		}
		else if(juiceName == "Avocado"){
			price = 100 * quantity;
			return price;
		}
		else if(juiceName == "Calamansi"){
			price = 150 * quantity;
			return price;
		}
		else if(juiceName == "Gooseberry"){
			price = 79.0 * quantity;
			return price;
		}
		else if(juiceName == "Guava"){
			price = 55.0 * quantity;
			return price;
		}
		else if(juiceName == "papya"){
			price = 45.0 * quantity;
			return price;
		}
		else if(juiceName == "Raspberry"){
			price = 70.0 * quantity;
			return price;
		}
	  else System.out.println("the entered juice price is not available");
			return price;
	}
	
	
}
