class GamingPcRunner{
	
	public static void main(String[]game){
		
	String brand	= GamingPc.pcBrand();
	System.out.println("the brand of pc is :"+brand);
	
	String operating  = GamingPc.os();
	System.out.println("the os of GamingPc is :"+operating);
	
	String  grapic = GamingPc.card();
	System.out.println("grapic card in  GamingPc :"+grapic);
	
	String  pc= GamingPc.pcseries();
	System.out.println("series is :"+pc);
	
	String  processors= GamingPc.processor();
	System.out.println("processor is :"+processors);
	
	int price = GamingPc.cost();
	System.out.println("cost of pc is :"+price);
	
	

	}
	
	
}
