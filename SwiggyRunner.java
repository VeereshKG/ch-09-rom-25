class SwiggyRunner{
	
		public static void main(String []veg){
		String foodName = "VegNoodles";
	double price = Swiggy.search(foodName);
	if(price > 0.0)
	System.out.println("the price  of "+foodName+" is :"+price);

int  quantity = 8;
  double withQuantity = Swiggy.search(foodName , quantity   );
  System.out.println("the price  of "+foodName+" for quantity "+quantity+" is :"+withQuantity);
}
}