class ZomatoRunner{
	
		public static void main(String []nonVeg){
		String foodName = "eggGuntur";
	double price = Zomato.getPrice(foodName);
	if(price > 0.0)
	System.out.println("the price  "+foodName+" is :"+price);
}


}