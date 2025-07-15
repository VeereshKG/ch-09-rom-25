class Swiggy{
	
	public static double search(String foodName){
		double price = 0.0;
		
		if(foodName == "DalKichadi"){
			price = 100.0;
			return price;
		}
		else if(foodName == "PalakRice"){
			price = 110.0;
			return price;
		}
		else if(foodName == "Idly"){
			price = 40;
			return price;
		}
		else if(foodName == "ButterRoti"){
			price = 30.0;
			return price;
		}
		else if(foodName == "AlloParotta"){
			price = 70.0;
			return price;
		}
		else if(foodName == "PlainNaan"){
			price = 30;
			return price;
		}
		else if(foodName == "NaanButter"){
			price = 35.0;
			return price;
		}
		else if(foodName == "MasalaDosa"){
			price = 65.0;
			return price;
		}
		else if(foodName == "PaneerKadai"){
			price = 190;
			return price;
		}
		else if(foodName == "PannerButterMasala"){
			price = 170.0;
			return price;
		}
		else if(foodName == "KajuMadsala"){
			price = 200.0;
			return price;
		}
		else if(foodName == "MushroomMasala"){
			price = 160.0;
			return price;
		}
		else if(foodName == "GobiChilli"){
			price = 110.0;
			return price;
		}
		else if(foodName == "PaneerManchurian"){
			price = 160.0;
			return price;
		}
		else if(foodName == "VegFriedRice"){
			price = 90.0;
			return price;
		}
		else if(foodName == "pepperDry"){
			price = 160.0;
			return price;
		}
		else if(foodName == "VegNoodles"){
			price = 100.0;
			return price;
		}
		else if(foodName == "paneerChilli"){
			price = 169.99;
			return price;
		}
		else if(foodName == "SchezwanFriedRice"){
			price = 149.5;
			return price;
		}
		else if(foodName == "Dal"){
			price = 140.0;
			return price;
		}
		else if(foodName == "Palak"){
			price = 173.0;
			return price;
		}
		else if(foodName == "AlloPalak"){
			price = 69.9;
			return price;
		}
		else if(foodName == "SouthIndian"){
			price = 70.0;
			return price;
		}
		else if(foodName == "Halwa"){
			price = 35;
			return price;
		}
		else if(foodName == "Jamun"){
			price = 20.0;
			return price;
		}
		else if(foodName == "Poori"){
			price = 70;
			return price;
		}
		else if(foodName == "ChowChowBath"){
			price = 65.0;
			return price;
		}
		else if(foodName == "RiceBath"){
			price = 50.0;
			return price;
		}
		else if(foodName == "KharaPongal"){
			price = 50.0;
			return price;
		}
		else if(foodName == "BisiBeleBatha"){
			price = 55.0;
			return price;
		}
		
		else System.out.println("the entered food price is not available");
			return price;
	}
	
	public static double search (String foodName, int quantity){
		double price = 0.0;
		
		if(foodName == "DalKichadi"){
			price = 100.0*quantity;
			return price;
		}
		else if(foodName == "PalakRice"){
			price = 110.0*quantity;
			return price;
		}
		else if(foodName == "Idly"){
			price = 40*quantity;
			return price;
		}
		else if(foodName == "ButterRoti"){
			price = 30.0*quantity;
			return price;
		}
		else if(foodName == "AlloParotta"){
			price = 70.0*quantity;
			return price;
		}
		else if(foodName == "PlainNaan"){
			price = 30*quantity;
			return price;
		}
		else if(foodName == "NaanButter"){
			price = 35.0*quantity;
			return price;
		}
		else if(foodName == "MasalaDosa"){
			price = 65.0*quantity;
			return price;
		}
		else if(foodName == "PaneerKadai"){
			price = 190*quantity;
			return price;
		}
		else if(foodName == "PannerButterMasala"){
			price = 170.0*quantity;
			return price;
		}
		else if(foodName == "KajuMadsala"){
			price = 200.0*quantity;
			return price;
		}
		else if(foodName == "MushroomMasala"){
			price = 160.0*quantity;
			return price;
		}
		else if(foodName == "GobiChilli"){
			price = 110.0*quantity;
			return price;
		}
		else if(foodName == "PaneerManchurian"){
			price = 160.0*quantity;
			return price;
		}
		else if(foodName == "VegFriedRice"){
			price = 90.0*quantity;
			return price;
		}
		else if(foodName == "pepperDry"){
			price = 160.0*quantity;
			return price;
		}
		else if(foodName == "VegNoodles"){
			price = 100.0*quantity;
			return price;
		}
		else if(foodName == "paneerChilli"){
			price = 169.99*quantity;
			return price;
		}
		else if(foodName == "SchezwanFriedRice"){
			price = 149.5*quantity;
			return price;
		}
		else if(foodName == "Dal"){
			price = 140.0*quantity;
			return price;
		}
		else if(foodName == "Palak"){
			price = 173.0*quantity;
			return price;
		}
		else if(foodName == "AlloPalak"){
			price = 69.9*quantity;
			return price;
		}
		else if(foodName == "SouthIndian"){
			price = 70.0*quantity;
			return price;
		}
		else if(foodName == "Halwa"){
			price = 35*quantity;
			return price;
		}
		else if(foodName == "Jamun"){
			price = 20.0*quantity;
			return price;
		}
		else if(foodName == "Poori"){
			price = 70*quantity;
			return price;
		}
		else if(foodName == "ChowChowBath"){
			price = 65.0*quantity;
			return price;
		}
		else if(foodName == "RiceBath"){
			price = 50.0*quantity;
			return price;
		}
		else if(foodName == "KharaPongal"){
			price = 50.0*quantity;
			return price;
		}
		else if(foodName == "BisiBeleBatha"){
			price = 55.0*quantity;
			return price;
		}
		
		else System.out.println("the entered food price is not available");
			return price;
	}
}
