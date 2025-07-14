class TailorRunner{
	
	public static void main(String[]game){
		
	String name	= Tailor.tailorName();
	System.out.println("name of tailor :"+name);
	
	String location  = Tailor.address();
	System.out.println("location is  :"+location);
	
	String  special = Tailor.specialization();
	System.out.println("specialization in :"+special);
	
	String  sName= Tailor.shop();
	System.out.println("Shop name is :"+sName);
	
	int price = Tailor.cost();
	System.out.println("cost per shirt :"+price);
	
	

	}
	
	
}
