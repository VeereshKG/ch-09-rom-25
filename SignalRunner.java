class SignalRunner{
	
	public static void main(String[]signs){
		
	String designedFor	= Signal.designed();
	System.out.println("The traffic Signal designed  :"+designedFor);
	
	String colourUsed = Signal.colour();
	System.out.println("the colours used in traffic signals :"+colourUsed);
	
	String  red = Signal.colourRed();
	System.out.println("the colour red is used to :"+red);
	
	String yellow = Signal.colourYellow();
	System.out.println("the the colour yellow is used to :"+yellow);
	
	String green = Signal.colourGreen();
	System.out.println("The the colour green is used to :"+green);
	

	}
	
	
}
