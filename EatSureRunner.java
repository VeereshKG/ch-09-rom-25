class EatSureRunner{
	
		public static void main(String []veg){
		String foodName = "BunMaska";
	double price = EatSure.getPrice(foodName);
	if(price > 0.0)
	System.out.println("the price  of "+foodName+" is :"+price);
}


}