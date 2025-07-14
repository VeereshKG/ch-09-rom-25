class WalkieTalkieRunner{
	
	public static void main(String[]talk){
		
	String portability	= WalkieTalkie.port();
	System.out.println("the portability is :"+portability);
	
	String limitedRange  = WalkieTalkie.range();
	System.out.println("the range of WalkieTalkie :"+limitedRange);
	
	String  uses = WalkieTalkie.use();
	System.out.println("use of WalkieTalkie :"+uses);
	
	String  rel= WalkieTalkie.reliable();
	System.out.println("reliabilty :"+rel);
	
	String battery = WalkieTalkie.battery();
	System.out.println("The runs on :"+battery);
	
	String walkie = WalkieTalkie.bands();
	System.out.println("the bands are :"+walkie);
	

	}
	
	
}
