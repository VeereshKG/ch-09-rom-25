class BannerRunner{
	
	public static void main(String[]info){
	
	String size = Banner.givenSize();
	System.out.println("the size of the Banner is :"+size);
	
	String shape	= Banner.givenShape();
	System.out.println("The shape of the banner is :"+shape);
	
	String  colour = Banner.col();
	System.out.println("the colour of Banner is :"+colour);
	
	String fonts = Banner.font();
	System.out.println("the font used to design banner is :"+fonts);
	
	int cost = Banner.givenCost();
	System.out.println("The price of Banner is :"+cost);
	

	}
	
	
}
