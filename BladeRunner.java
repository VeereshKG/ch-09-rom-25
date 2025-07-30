class BladeRunner{
	
	public static void main(String []blade){
          Blade ref1 = new Blade(1, "Gillette");
           System.out.println("the blade is "+ref1.bladeId);
           System.out.println("the blade brand is "+ref1.brand);
		   
          Blade ref2 = new Blade(20.0);
		  System.out.println("the blade price is "+ref2.price);
		  
		  String uses[] = {"Cutting","Sharping"};
		   Blade ref3 = new Blade( "Stainless Steel" ,uses );
		   System.out.println("the blade type is "+ref3.type);
		   ref3.getBladeInfo();

	}
}

		   
		   