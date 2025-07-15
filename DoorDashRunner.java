class DoorDashRunner{
	
		public static void main(String []deserts){
			
	String foodName = "ButterMochi";
	double price = DoorDash.search(foodName);
	if(price > 0.0)
	System.out.println("the price  of "+foodName+" is :"+price);

    int quantity = 7;
	double withQuantity = DoorDash.search(foodName , quantity);
	System.out.println("the price  of "+foodName+" for quantity "+quantity+" is :"+withQuantity);
}


}