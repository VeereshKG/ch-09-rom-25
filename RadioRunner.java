class RadioRunner{
	
	public static void main(String[]propertis){
	String brand	= Radio.radioBrand();
	System.out.println("The Brand of Radio is :"+brand);
	
	String colour = Radio.givenColour();
	System.out.println("the colour of radio is :"+colour);
	
	String  feature = Radio.radioFeature();
	System.out.println("the feature of radio is :"+feature);
	
	String connectivity = Radio.rConnectivity();
	System.out.println("the connectivity type is :"+connectivity);
	
	int price = Radio.rPrice();
	System.out.println("The price of radio is :"+price);
	

	}
	
	
}
