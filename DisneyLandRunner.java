class DisneyLandRunner{
	
	public static void main(String[]land){
		
	String location	= DisneyLand.address();
	System.out.println("the location of DisneyLand is :"+location);
	
	String open  = DisneyLand.dlOpened();
	System.out.println("opened in  :"+open);
	
	String  disney = DisneyLand.theme();
	System.out.println("these is :"+disney);
	
	boolean  passes= DisneyLand.annualPases();
	System.out.println("is annualPases availabel :"+passes);
	
	int price = DisneyLand.cost();
	System.out.println("cost of DisneyLand is :"+price);
	
	

	}
	
	
}
