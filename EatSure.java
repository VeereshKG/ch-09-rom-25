class EatSure{
	
	public static double search(String foodName){
		double price = 0.0;
		
		if(foodName == "CurdRice"){
			price = 99.0;
			return price;
		}
		else if(foodName == "Vada"){
			price = 59.5;
			return price;
		}
		else if(foodName == "RumaliRoti"){
			price = 35.0;
			return price;
		}
		else if(foodName == "CrispyFries"){
			price = 59;
			return price;
		}
		else if(foodName == "Nachos"){
			price = 69.9;
			return price;
		}
		else if(foodName == "AlloBurger"){
			price = 79.6;
			return price;
		}
		else if(foodName == "Nuggets"){
			price = 99.9;
			return price;
		}
		else if(foodName == "PizzaPuff"){
			price = 69.5;
			return price;
		}
		else if(foodName == "eggPuff"){
			price = 30.0;
			return price;
		}
		else if(foodName == "pizza"){
			price = 399.9;
			return price;
		}
		else if(foodName == "Coke"){
			price = 67.5;
			return price;
		}
		else if(foodName == "Brownie"){
			price = 79.0;
			return price;
		}
		else if(foodName == "redVelvet"){
			price = 599.0;
			return price;
		}
		else if(foodName == "DryFruitKulfi"){
			price = 89.9;
			return price;
		}
		else if(foodName == "ChickenStrips"){
			price = 199;
			return price;
		}
		else if(foodName == "ChickenPopCorn"){
			price = 126.0;
			return price;
		}
		else if(foodName == "PotatoWedges"){
			price = 89;
			return price;
		}
		else if(foodName == "ChickenRoll"){
			price = 99.0;
			return price;
		}
		else if(foodName == "ChickenFingers"){
			price = 159.0;
			return price;
		}
		else if(foodName == "CheeseShots"){
			price = 78.0;
			return price;
		}
		else if(foodName == "momos"){
			price = 80.0;
			return price;
		}
		else if(foodName == "peri periWings"){
			price = 100.0;
			return price;
		}
		else if(foodName == "Samosa"){
			price = 20.0;
			return price;
		}
		else if(foodName == "ColdCoffee"){
			price = 100.0;
			return price;
		}
		else if(foodName == "ZingyParcel"){
			price = 59.0;
			return price;
		}
		else if(foodName == "ChickenMeatBalls"){
			price = 149;
			return price;
		}
		else if(foodName == "masalaPuri"){
			price = 40.0;
			return price;
		}
		else if(foodName == "ButterBun"){
			price = 50.0;
			return price;
		}
		else if(foodName == "BunMaska"){
			price = 70.0;
			return price;
		}
		else if(foodName == "CheeseTost"){
			price = 125.0;
			return price;
		}
		
		
		
		else System.out.println("the entered food price is not available");
			return price;
	}
	
	public static double search(String foodName , int quantity){
		double price = 0.0;
		
		if(foodName == "CurdRice"){
			price = 99.0 * quantity;
			return price;
		}
		else if(foodName == "Vada"){
			price = 59.5 * quantity;
			return price;
		}
		else if(foodName == "RumaliRoti"){
			price = 35.0 * quantity;
			return price;
		}
		else if(foodName == "CrispyFries"){
			price = 59 * quantity;
			return price;
		}
		else if(foodName == "Nachos"){
			price = 69.9 * quantity;
			return price;
		}
		else if(foodName == "AlloBurger"){
			price = 79.6 * quantity;
			return price;
		}
		else if(foodName == "Nuggets"){
			price = 99.9 * quantity;
			return price;
		}
		else if(foodName == "PizzaPuff"){
			price = 69.5 * quantity;
			return price;
		}
		else if(foodName == "eggPuff"){
			price = 30.0 * quantity;
			return price;
		}
		else if(foodName == "pizza"){
			price = 399.9 * quantity;
			return price;
		}
		else if(foodName == "Coke"){
			price = 67.5 * quantity;
			return price;
		}
		else if(foodName == "Brownie"){
			price = 79.0 * quantity;
			return price;
		}
		else if(foodName == "redVelvet"){
			price = 599.0 * quantity;
			return price;
		}
		else if(foodName == "DryFruitKulfi"){
			price = 89.9 * quantity;
			return price;
		}
		else if(foodName == "ChickenStrips"){
			price = 199 * quantity;
			return price;
		}
		else if(foodName == "ChickenPopCorn"){
			price = 126.0 * quantity;
			return price;
		}
		else if(foodName == "PotatoWedges"){
			price = 89 * quantity;
			return price;
		}
		else if(foodName == "ChickenRoll"){
			price = 99.0 * quantity;
			return price;
		}
		else if(foodName == "ChickenFingers"){
			price = 159.0 * quantity;
			return price;
		}
		else if(foodName == "CheeseShots"){
			price = 78.0 * quantity;
			return price;
		}
		else if(foodName == "momos"){
			price = 80.0 * quantity;
			return price;
		}
		else if(foodName == "peri periWings"){
			price = 100.0 * quantity;
			return price;
		}
		else if(foodName == "Samosa"){
			price = 20.0 * quantity;
			return price;
		}
		else if(foodName == "ColdCoffee"){
			price = 100.0 * quantity;
			return price;
		}
		else if(foodName == "ZingyParcel"){
			price = 59.0 * quantity;
			return price;
		}
		else if(foodName == "ChickenMeatBalls"){
			price = 149 * quantity;
			return price;
		}
		else if(foodName == "masalaPuri"){
			price = 40.0 * quantity;
			return price;
		}
		else if(foodName == "ButterBun"){
			price = 50.0 * quantity;
			return price;
		}
		else if(foodName == "BunMaska"){
			price = 70.0 * quantity;
			return price;
		}
		else if(foodName == "CheeseTost"){
			price = 125.0 * quantity;
			return price;
		}
		
		
		
		else System.out.println("the entered food price is not available");
			return price;
	}
}
