class EatSureRunner{
	
		public static void main(String []veg){
		String foodName = "CheeseShots";
	double price = EatSure.search(foodName);
	if(price > 0.0)
	System.out.println("the price  of "+foodName+" is :"+price);

  int  quantity = 5;
  double withQuantity = EatSure.search(foodName , quantity);
  System.out.println("the price  of "+foodName+" for quantity "+quantity+" is :"+withQuantity);
}


}