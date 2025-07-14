class HelloFreshRunner{
	
		public static void main(String []juice){
		String juiceName = "GrapeFruit";
	double price = HelloFresh.getPrice(juiceName);
	if(price > 0.0)
	System.out.println("the price  of "+juiceName+" juice is :"+price);
}


}