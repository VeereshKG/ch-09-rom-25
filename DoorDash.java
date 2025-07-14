class DoorDash{
	
	public static double getPrice(String foodName){
		double price = 0.0;
		
		if(foodName == "Tiramisu"){
			price = 200.0;
		}
		else if(foodName == "CremeBrulee"){
			price = 199.9;
		}
		else if(foodName == "Baklava"){
			price = 219.0;
		}
		else if(foodName == "ApplePie"){
			price = 250.6;
		}
		else if(foodName == "ChocolateBrownie"){
			price = 159.0;
		}
		else if(foodName == "Mochi"){
			price = 358.9;
		}
		else if(foodName == "cookies"){
			price = 30.0;
		}
		else if(foodName == "Gleato"){
			price = 199.99;
		}
		else if(foodName == "Banoffee"){
			price = 209.5;
		}
		else if(foodName == "CheesCake"){
			price = 188.0;
		}
		else if(foodName == "Churros"){
			price = 299.9;
		}
		else if(foodName == "CremeCaramel"){
			price = 154.2;
		}
		else if(foodName == "Pavlova"){
			price = 265;
		}
		else if(foodName == "Waffle"){
			price = 277.0;
		}
		else if(foodName == "BlackForest"){
			price = 255.3;
		}
		else if(foodName == "Cannoli"){
			price = 158;
		}
		else if(foodName == "Doughnut"){
			price = 99.0;
		}
		else if(foodName == "Cakes"){
			price = 125.5;
		}
		else if(foodName == "ChocolateMousse"){
			price = 263.0;
		}
		else if(foodName == "PastelDenata"){
			price = 211.2;
		}
		else if(foodName == "Peruvian"){
			price = 654.6;
		}
		else if(foodName == "TresLeches"){
			price = 777.7;
		}
		else if(foodName == "Belgium"){
			price = 999.9;
		}
		else if(foodName == "BeanPie"){
			price = 458.0;
		}
		else if(foodName == "ButterMochi"){
			price = 564.3;
		}
		else if(foodName == "Candy"){
			price = 421.0;
		}
		else if(foodName == "DirtCake"){
			price = 256.0;
		}
		else if(foodName == "Grapepie"){
			price = 458.0;
		}
		else if(foodName == "Hostess"){
			price = 555.0;
		}
		else if(foodName == "lavaCkae"){
			price = 568.0;
		}
	
		
		else System.out.println("the entered food price is not available");
			return price;
	}
}
