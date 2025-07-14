class MarketRunner{
	
	public static void main(String[]market){
		
	String typeOfMarket	= Market.type();
	System.out.println("The type of market is  :"+typeOfMarket);
	
	int noOfShops  = Market.number();
	System.out.println("number of shopes in the market :"+noOfShops);
	
	String  openTime = Market.open();
	System.out.println("opening time of market :"+openTime);
	
	String closingTime = Market.closing();
	System.out.println("closing time of market :"+closingTime);
	
	String nameOfMarket = Market.name();
	System.out.println("The name Of Market is :"+nameOfMarket);
	
	String presidentOfMarket = Market.president();
	System.out.println("The market president is :"+presidentOfMarket);
	

	}
	
	
}
