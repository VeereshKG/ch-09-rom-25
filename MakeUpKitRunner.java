class MakeUpKitRunner{
	
	public static void main(String[]makeup){
		
	int items	= MakeUpKit.item();
	System.out.println("the number items in kit is :"+items);
	
	String brand  = MakeUpKit.givenBrand();
	System.out.println("the brand of MakeUpKit is :"+brand);
	
	String  products = MakeUpKit.product();
	System.out.println("products in  MakeUpKit :"+products);
	
	String  ex= MakeUpKit.date();
	System.out.println("expiry date is :"+ex);
	
	String date = MakeUpKit.mf();
	System.out.println("manufacture date is :"+date);
	
	

	}
	
	
}
