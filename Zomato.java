class Zomato{
	
	public static double search(String foodName){
		double price = 0.0;
		
		if(foodName == "GheeRice"){
			price = 269.0;
			return price;
		}
		else if(foodName == "ChickenDry"){
			price = 275.0;
			return price;
		}
		else if(foodName == "Erachi"){
			price = 250.0;
			return price;
		}
		else if(foodName == "DrumStick"){
			price = 364.0;
			return price;
		}
		else if(foodName == "Kabab"){
			price = 210;
			return price;
		}
		else if(foodName == "Fry"){
			price = 224.0;
			return price;
		}
		else if(foodName == "ChickenChilli"){
			price = 238.0;
			return price;
		}
		else if(foodName == "ChickenManchurian"){
			price = 224.0;
			return price;
		}
		else if(foodName == "Chicken65"){
			price = 254.0;
			return price;
		}
		else if(foodName == "LemonChicken"){
			price = 2780.0;
			return price;
		}
		else if(foodName == "lollypop"){
			price = 252.0;
			return price;
		}
		else if(foodName == "FrenchChicken"){
			price = 290.0;
			return price;
		}
		else if(foodName == "GunturChicken"){
			price = 252.0;
			return price;
		}
		else if(foodName == "ChickenPepperDry"){
			price = 254.0;
			return price;
		}
		else if(foodName == "wings"){
			price = 308.0;
			return price;
		}
		else if(foodName == "garlicChicken"){
			price = 299.0;
			return price;
		}
		else if(foodName == "Tandoori"){
			price = 560.0;
			return price;
		}
		else if(foodName == "ChickenTikka"){
			price = 294.0;
			return price;
		}
		else if(foodName == "muttonBiriyani"){
			price = 322.0;
			return price;
		}
		else if(foodName == "ChickenBiriyani"){
			price = 250.0;
			return price;
		}
		else if(foodName == "ChickenMasala"){
			price = 320.0;
			return price;
		}
		else if(foodName == "Kadai"){
			price = 238.0;
			return price;
		}
		else if(foodName == "Kolhaluri"){
			price = 259.3;
			return price;
		}
		else if(foodName == "MuttonFry"){
			price = 200.0;
			return price;
		}
		else if(foodName == "punjabiChicken"){
			price = 266.0;
			return price;
		}
		else if(foodName == "ChickenPatiyala"){
			price = 366.0;
			return price;
		}
		else if(foodName == "eggBurji"){
			price = 84;
			return price;
		}
		else if(foodName == "eegRice"){
			price = 50.0;
			return price;
		}
		else if(foodName == "eggLemon"){
			price = 180.0;
			return price;
		}
		else if(foodName == "Eggpakoda"){
			price = 140.0;
			return price;
		}
		else if(foodName == "eggGuntur"){
			price = 150.0;
			return price;
		}
		
		else System.out.println("the entered food price is not available");
			return price;
	}
	
	public static double search(String foodName,int quantity){
				double price = 0.0;
		
		if(foodName == "GheeRice"){
			price = 269.0 * quantity;
			return price;
		}
		else if(foodName == "ChickenDry"){
			price = 275.0 * quantity;
			return price;
		}
		else if(foodName == "Erachi"){
			price = 250.0 * quantity;
			return price;
		}
		else if(foodName == "DrumStick"){
			price = 364.0 * quantity;
			return price;
		}
		else if(foodName == "Kabab"){
			price = 210 * quantity;
			return price;
		}
		else if(foodName == "Fry"){
			price = 224.0 * quantity;
			return price;
		}
		else if(foodName == "ChickenChilli"){
			price = 238.0 * quantity;
			return price;
		}
		else if(foodName == "ChickenManchurian"){
			price = 224.0 * quantity;
			return price;
		}
		else if(foodName == "Chicken65"){
			price = 254.0 * quantity;
			return price;
		}
		else if(foodName == "LemonChicken"){
			price = 2780.0 * quantity;
			return price;
		}
		else if(foodName == "lollypop"){
			price = 252.0 * quantity;
			return price;
		}
		else if(foodName == "FrenchChicken"){
			price = 290.0 * quantity;
			return price;
		}
		else if(foodName == "GunturChicken"){
			price = 252.0 * quantity;
			return price;
		}
		else if(foodName == "ChickenPepperDry"){
			price = 254.0 * quantity;
			return price;
		}
		else if(foodName == "wings"){
			price = 308.0 * quantity;
			return price;
		}
		else if(foodName == "garlicChicken"){
			price = 299.0 * quantity ;
			return price;
		}
		else if(foodName == "Tandoori"){
			price = 560.0 * quantity;
			return price;
		}
		else if(foodName == "ChickenTikka"){
			price = 294.0 * quantity;
			return price;
		}
		else if(foodName == "muttonBiriyani"){
			price = 322.0 * quantity;
			return price;
		}
		else if(foodName == "ChickenBiriyani"){
			price = 250.0 * quantity;
			return price;
		}
		else if(foodName == "ChickenMasala"){
			price = 320.0 * quantity;
			return price;
		}
		else if(foodName == "Kadai"){
			price = 238.0 * quantity;
			return price;
		}
		else if(foodName == "Kolhaluri"){
			price = 259.3 * quantity;
			return price;
		}
		else if(foodName == "MuttonFry"){
			price = 200.0 * quantity;
			return price;
		}
		else if(foodName == "punjabiChicken"){
			price = 266.0 * quantity;
			return price;
		}
		else if(foodName == "ChickenPatiyala"){
			price = 366.0 * quantity * quantity;
			return price;
		}
		else if(foodName == "eggBurji"){
			price = 84 * quantity;
			return price;
		}
		else if(foodName == "eegRice"){
			price = 50.0 * quantity;
			return price;
		}
		else if(foodName == "eggLemon"){
			price = 180.0 * quantity;
			return price;
		}
		else if(foodName == "Eggpakoda"){
			price = 140.0 * quantity;
			return price;
		}
		else if(foodName == "eggGuntur"){
			price = 150.0 * quantity;
			return price;
		}
		
		else System.out.println("the entered food price is not available");
			return price;
	}
}
