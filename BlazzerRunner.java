class BlazzerRunner{
	
	public static void main(String[]blazz){
		
       String colors[] = {"black","blue"};
        Blazzer ref1 = new Blazzer(1,  colors);
		System.out.println("the id is "+ref1.blazzerId);
		ref1.getBlazzerInfo();
		
		Blazzer ref2 = new Blazzer(30, "peter england", 4000.00);
		System.out.println("the size is "+ref2.size);
		System.out.println("the brand is "+ref2.brand);
		System.out.println("the price is "+ref2.price);
		
		Blazzer ref3 = new Blazzer("cotton");
		System.out.println("the fabric is "+ref3.fabric);
		
     


       
    }
}



     
	