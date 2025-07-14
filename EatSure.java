class EatSure{
	
	public static double getPrice(String foodName){
		double price = 0.0;
		
		if(foodName == "CurdRice"){
			price = 99.0;
		}
		else if(foodName == "Vada"){
			price = 59.5;
		}
		else if(foodName == "RumaliRoti"){
			price = 35.0;
		}
		else if(foodName == "CrispyFries"){
			price = 59;
		}
		else if(foodName == "Nachos"){
			price = 69.9;
		}
		else if(foodName == "AlloBurger"){
			price = 79.6;
		}
		else if(foodName == "Nuggets"){
			price = 99.9;
		}
		else if(foodName == "PizzaPuff"){
			price = 69.5;
		}
		else if(foodName == "eggPuff"){
			price = 30.0;
		}
		else if(foodName == "pizza"){
			price = 399.9;
		}
		else if(foodName == "Coke"){
			price = 67.5;
		}
		else if(foodName == "Brownie"){
			price = 79.0;
		}
		else if(foodName == "redVelvet"){
			price = 599.0;
		}
		else if(foodName == "DryFruitKulfi"){
			price = 89.9;
		}
		else if(foodName == "ChickenStrips"){
			price = 199;
		}
		else if(foodName == "ChickenPopCorn"){
			price = 126.0;
		}
		else if(foodName == "PotatoWedges"){
			price = 89;
		}
		else if(foodName == "ChickenRoll"){
			price = 99.0;
		}
		else if(foodName == "ChickenFingers"){
			price = 159.0;
		}
		else if(foodName == "CheeseShots"){
			price = 78.0;
		}
		else if(foodName == "momos"){
			price = 80.0;
		}
		else if(foodName == "peri periWings"){
			price = 100.0;
		}
		else if(foodName == "Samosa"){
			price = 20.0;
		}
		else if(foodName == "ColdCoffee"){
			price = 100.0;
		}
		else if(foodName == "ZingyParcel"){
			price = 59.0;
		}
		else if(foodName == "ChickenMeatBalls"){
			price = 149;
		}
		else if(foodName == "masalaPuri"){
			price = 40.0;
		}
		else if(foodName == "ButterBun"){
			price = 50.0;
		}
		else if(foodName == "BunMaska"){
			price = 70.0;
		}
		else if(foodName == "CheeseTost"){
			price = 125.0;
		}
		
		
		
		else System.out.println("the entered food price is not available");
			return price;
	}
}
