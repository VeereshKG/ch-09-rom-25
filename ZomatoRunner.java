class ZomatoRunner{
	
		public static void main(String []nonVeg){
		String foodName = "FrenchChicken";
	double price = Zomato.search(foodName);
	if(price > 0.0)
	System.out.println("the price  "+foodName+" is :"+price);

    int  quantity = 14;
  double withQuantity = Zomato.search(foodName , quantity   );
  System.out.println("the price  of "+foodName+" for quantity "+quantity+" is :"+withQuantity);
}


}