class HelloFreshRunner{
	
		public static void main(String []juice){
		String juiceName = "papya";
	double price = HelloFresh.search(juiceName);
	if(price > 0.0)
	System.out.println("the price  of "+juiceName+" juice is :"+price);

   int quantity = 5;
  double withQuantity = HelloFresh.search(juiceName , quantity);
  
  System.out.println("the price of "+juiceName+" juice quantity "+quantity+" is "+withQuantity);
}


}