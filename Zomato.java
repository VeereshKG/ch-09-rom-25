class Zomato{
	
	public static double getPrice(String foodName){
		double price = 0.0;
		
		if(foodName == "GheeRice"){
			price = 269.0;
		}
		else if(foodName == "ChickenDry"){
			price = 275.0;
		}
		else if(foodName == "Erachi"){
			price = 250.0;
		}
		else if(foodName == "DrumStick"){
			price = 364.0;
		}
		else if(foodName == "Kabab"){
			price = 210;
		}
		else if(foodName == "Fry"){
			price = 224.0;
		}
		else if(foodName == "ChickenChilli"){
			price = 238.0;
		}
		else if(foodName == "ChickenManchurian"){
			price = 224.0;
		}
		else if(foodName == "Chicken65"){
			price = 254.0;
		}
		else if(foodName == "LemonChicken"){
			price = 2780.0;
		}
		else if(foodName == "lollypop"){
			price = 252.0;
		}
		else if(foodName == "FrenchChicken"){
			price = 290.0;
		}
		else if(foodName == "GunturChicken"){
			price = 252.0;
		}
		else if(foodName == "ChickenPepperDry"){
			price = 254.0;
		}
		else if(foodName == "wings"){
			price = 308.0;
		}
		else if(foodName == "garlicChicken"){
			price = 299.0;
		}
		else if(foodName == "Tandoori"){
			price = 560.0;
		}
		else if(foodName == "ChickenTikka"){
			price = 294.0;
		}
		else if(foodName == "muttonBiriyani"){
			price = 322.0;
		}
		else if(foodName == "ChickenBiriyani"){
			price = 250.0;
		}
		else if(foodName == "ChickenMasala"){
			price = 320.0;
		}
		else if(foodName == "Kadai"){
			price = 238.0;
		}
		else if(foodName == "Kolhaluri"){
			price = 259.3;
		}
		else if(foodName == "MuttonFry"){
			price = 200.0;
		}
		else if(foodName == "punjabiChicken"){
			price = 266.0;
		}
		else if(foodName == "ChickenPatiyala"){
			price = 366.0;
		}
		else if(foodName == "eggBurji"){
			price = 84;
		}
		else if(foodName == "eegRice"){
			price = 50.0;
		}
		else if(foodName == "eggLemon"){
			price = 180.0;
		}
		else if(foodName == "Eggpakoda"){
			price = 140.0;
		}
		else if(foodName == "eggGuntur"){
			price = 150.0;
		}
		
		else System.out.println("the entered food price is not available");
			return price;
	}
}
