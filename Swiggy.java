class Swiggy{
	
	public static double getPrice(String foodName){
		double price = 0.0;
		
		if(foodName == "DalKichadi"){
			price = 100.0;
		}
		else if(foodName == "PalakRice"){
			price = 110.0;
		}
		else if(foodName == "Idly"){
			price = 40;
		}
		else if(foodName == "ButterRoti"){
			price = 30.0;
		}
		else if(foodName == "AlloParotta"){
			price = 70.0;
		}
		else if(foodName == "PlainNaan"){
			price = 30;
		}
		else if(foodName == "NaanButter"){
			price = 35.0;
		}
		else if(foodName == "MasalaDosa"){
			price = 65.0;
		}
		else if(foodName == "PaneerKadai"){
			price = 190;
		}
		else if(foodName == "PannerButterMasala"){
			price = 170.0;
		}
		else if(foodName == "KajuMadsala"){
			price = 200.0;
		}
		else if(foodName == "MushroomMasala"){
			price = 160.0;
		}
		else if(foodName == "GobiChilli"){
			price = 110.0;
		}
		else if(foodName == "PaneerManchurian"){
			price = 160.0;
		}
		else if(foodName == "VegFriedRice"){
			price = 90.0;
		}
		else if(foodName == "pepperDry"){
			price = 160.0;
		}
		else if(foodName == "VegNoodles"){
			price = 100.0;
		}
		else if(foodName == "paneerChilli"){
			price = 169.99;
		}
		else if(foodName == "SchezwanFriedRice"){
			price = 149.5;
		}
		else if(foodName == "Dal"){
			price = 140.0;
		}
		else if(foodName == "Palak"){
			price = 173.0;
		}
		else if(foodName == "AlloPalak"){
			price = 69.9;
		}
		else if(foodName == "SouthIndian"){
			price = 70.0;
		}
		else if(foodName == "Halwa"){
			price = 35;
		}
		else if(foodName == "Jamun"){
			price = 20.0;
		}
		else if(foodName == "Poori"){
			price = 70;
		}
		else if(foodName == "ChowChowBath"){
			price = 65.0;
		}
		else if(foodName == "RiceBath"){
			price = 50.0;
		}
		else if(foodName == "KharaPongal"){
			price = 50.0;
		}
		else if(foodName == "BisiBeleBatha"){
			price = 55.0;
		}
		
		else System.out.println("the entered food price is not available");
			return price;
	}
}
