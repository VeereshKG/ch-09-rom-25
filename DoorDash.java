class DoorDash{
	
	public static double search(String foodName){
		double price = 0.0;
		
		if(foodName == "Tiramisu"){
			price = 200.0;
			return price;
		}
		else if(foodName == "CremeBrulee"){
			price = 199.9;
			return price;
		}
		else if(foodName == "Baklava"){
			price = 219.0;
			return price;
		}
		else if(foodName == "ApplePie"){
			price = 250.6;
			return price;
		}
		else if(foodName == "ChocolateBrownie"){
			price = 159.0;
			return price;
		}
		else if(foodName == "Mochi"){
			price = 358.9;
			return price;
		}
		else if(foodName == "cookies"){
			price = 30.0;
			return price;
		}
		else if(foodName == "Gleato"){
			price = 199.99;
			return price;
		}
		else if(foodName == "Banoffee"){
			price = 209.5;
			return price;
		}
		else if(foodName == "CheesCake"){
			price = 188.0;
			return price;
		}
		else if(foodName == "Churros"){
			price = 299.9;
			return price;
		}
		else if(foodName == "CremeCaramel"){
			price = 154.2;
			return price;
		}
		else if(foodName == "Pavlova"){
			price = 265;
			return price;
		}
		else if(foodName == "Waffle"){
			price = 277.0;
			return price;
		}
		else if(foodName == "BlackForest"){
			price = 255.3;
			return price;
		}
		else if(foodName == "Cannoli"){
			price = 158;
			return price;
		}
		else if(foodName == "Doughnut"){
			price = 99.0;
			return price;
		}
		else if(foodName == "Cakes"){
			price = 125.5;
			return price;
		}
		else if(foodName == "ChocolateMousse"){
			price = 263.0;
			return price;
		}
		else if(foodName == "PastelDenata"){
			price = 211.2;
			return price;
		}
		else if(foodName == "Peruvian"){
			price = 654.6;
			return price;
		}
		else if(foodName == "TresLeches"){
			price = 777.7;
			return price;
		}
		else if(foodName == "Belgium"){
			price = 999.9;
			return price;
		}
		else if(foodName == "BeanPie"){
			price = 458.0;
			return price;
		}
		else if(foodName == "ButterMochi"){
			price = 564.3;
			return price;
		}
		else if(foodName == "Candy"){
			price = 421.0;
			return price;
		}
		else if(foodName == "DirtCake"){
			price = 256.0;
			return price;
		}
		else if(foodName == "Grapepie"){
			price = 458.0;
			return price;
		}
		else if(foodName == "Hostess"){
			price = 555.0;
			return price;
		}
		else if(foodName == "lavaCkae"){
			price = 568.0;
			return price;
		}
	
		
		else System.out.println("the entered food price is not available");
			return price;
	}
	
	public static double search(String foodName,int quantity){
		double price = 0.0;
		
		if(foodName == "Tiramisu"){
			price = 200.0 * quantity;
			return price;
		}
		else if(foodName == "CremeBrulee"){
			price = 199.9 * quantity;
			return price;
		}
		else if(foodName == "Baklava"){
			price = 219.0 * quantity;
			return price;
		}
		else if(foodName == "ApplePie"){
			price = 250.6 * quantity;
			return price;
		}
		else if(foodName == "ChocolateBrownie"){
			price = 159.0 * quantity;
			return price;
		}
		else if(foodName == "Mochi"){
			price = 358.9 * quantity;
			return price;
		}
		else if(foodName == "cookies"){
			price = 30.0 * quantity;
			return price;
		}
		else if(foodName == "Gleato"){
			price = 199.99 * quantity;
			return price;
		}
		else if(foodName == "Banoffee"){
			price = 209.5 * quantity;
			return price;
		}
		else if(foodName == "CheesCake"){
			price = 188.0 * quantity;
			return price;
		}
		else if(foodName == "Churros"){
			price = 299.9 * quantity;
			return price;
		}
		else if(foodName == "CremeCaramel"){
			price = 154.2 * quantity;
			return price;
		}
		else if(foodName == "Pavlova"){
			price = 265 * quantity;
			return price;
		}
		else if(foodName == "Waffle"){
			price = 277.0 * quantity;
			return price;
		}
		else if(foodName == "BlackForest"){
			price = 255.3 * quantity * quantity;
			return price;
		}
		else if(foodName == "Cannoli"){
			price = 158 * quantity;
			return price;
		}
		else if(foodName == "Doughnut"){
			price = 99.0 * quantity;
			return price;
		}
		else if(foodName == "Cakes"){
			price = 125.5 * quantity;
			return price;
		}
		else if(foodName == "ChocolateMousse"){
			price = 263.0 * quantity;
			return price;
		}
		else if(foodName == "PastelDenata"){
			price = 211.2 * quantity;
			return price;
		}
		else if(foodName == "Peruvian"){
			price = 654.6 * quantity;
			return price;
		}
		else if(foodName == "TresLeches"){
			price = 777.7 * quantity;
			return price;
		}
		else if(foodName == "Belgium"){
			price = 999.9 * quantity;
			return price;
		}
		else if(foodName == "BeanPie"){
			price = 458.0 * quantity;
			return price;
		}
		else if(foodName == "ButterMochi"){
			price = 564.3 * quantity;
			return price;
		}
		else if(foodName == "Candy"){
			price = 421.0 * quantity;
			return price;
		}
		else if(foodName == "DirtCake"){
			price = 256.0 * quantity;
			return price;
		}
		else if(foodName == "Grapepie"){
			price = 458.0 * quantity;
			return price;
		}
		else if(foodName == "Hostess"){
			price = 555.0 * quantity;
			return price;
		}
		else if(foodName == "lavaCkae"){
			price = 568.0 * quantity;
			return price;
		}
	
		
		else System.out.println("the entered food price is not available");
			return price;
	}
}
