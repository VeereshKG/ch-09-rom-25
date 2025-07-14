class TyreRunner{
	
	public static void main(String[]game){
		
	String brand	= Tyre.tyreBrand();
	System.out.println("the brand of tyre is :"+brand);
	
	String used  = Tyre.material();
	System.out.println("the material used is :"+used);
	
	String  shape = Tyre.tyreShape();
	System.out.println("shape of  Tyre :"+shape);
	
	String  capacity= Tyre.tyreCapacity();
	System.out.println("capacity is :"+capacity);
	
	int price = Tyre.cost();
	System.out.println("cost of tyre is :"+price);
	
	

	}
	
	
}
