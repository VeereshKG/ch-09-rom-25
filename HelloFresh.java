class HelloFresh{
	
	public static double getPrice(String juiceName){
		double price = 0.0;
		
		if(juiceName == "Orange"){
			price = 150.0;
		}
		else if(juiceName == "Apple"){
			price = 160.0;
		}
		else if(juiceName == "Pineapple"){
			price = 120.0;
		}
		else if(juiceName == "CranBerry"){
			price = 99.0;
		}
		else if(juiceName == "GrapeFruit"){
			price = 100.0;
		}
		else if(juiceName == "Pomegrante"){
			price = 160.0;
		}
		else if(juiceName == "watermelon"){
			price = 55.0;
		}
		else if(juiceName == "Coconut"){
			price = 65.0;
		}
		else if(juiceName == "grape"){
			price = 70.0;
		}
		else if(juiceName == "SugarCane"){
			price = 120.0;
		}
		else if(juiceName == "Beet"){
			price = 99.0;
		}
		else if(juiceName == "Bluebeery"){
			price = 67.0;
		}
		else if(juiceName == "Cherry"){
			price = 78.0;
		}
		else if(juiceName == "lemon"){
			price = 99.9;
		}
		else if(juiceName == "carrot"){
			price = 100;
		}
		else if(juiceName == "celery"){
			price = 150;
		}
		else if(juiceName == "vegetable"){
			price = 170;
		}
		else if(juiceName == "kiwi"){
			price = 80;
		}
		else if(juiceName == "Strawberry"){
			price = 40;
		}
		else if(juiceName == "wheetGrass"){
			price = 70;
		}
		else if(juiceName == "Cantaloupe"){
			price = 180;
		}
		else if(juiceName == "mosambi"){
			price = 40;
		}
		else if(juiceName == "jal jeera"){
			price = 35;
		}
		else if(juiceName == "AamPanna"){
			price = 89.0;
		}
		else if(juiceName == "Avocado"){
			price = 100;
		}
		else if(juiceName == "Calamansi"){
			price = 150;
		}
		else if(juiceName == "Gooseberry"){
			price = 79.0;
		}
		else if(juiceName == "Guava"){
			price = 55.0;
		}
		else if(juiceName == "papya"){
			price = 45.0;
		}
		else if(juiceName == "Raspberry"){
			price = 70.0;
		}
		
		
		else System.out.println("the entered juice price is not available");
			return price;
	}
}
