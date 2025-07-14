class GoldRunner{
	
	public static void main(String[]args){
		
	int cost = Gold.price();
	System.out.println("the gold price per gram is	:"+cost);
	
	String measured  = Gold.measure();
	System.out.println("the gold is measured through :"+measured);
	
	String  density = Gold.dense();
	System.out.println("density means:"+density);
	
	String meltingPoint = Gold.melting();
	System.out.println("the melting point of gold is :"+meltingPoint);
	
	String boilingPoint = Gold.boiling();
	System.out.println("the boiling point of gold is :"+boilingPoint);
	}
	
	
}
