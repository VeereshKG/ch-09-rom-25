class ClothesRunner{
	
	public static void main(String[]cloth){
		
	String material	= Clothes.mater();
	System.out.println("The material of cloth is  :"+material);
	
	String brand = Clothes.clothBrand();
	System.out.println("the brand of cloth is :"+brand);
	
	int  price = Clothes.cost();
	System.out.println("the price of selected cloth is :"+price);
	
	String colour = Clothes.givencolour();
	System.out.println("the colour of cloth is  :"+colour);
	
	String typeOfCloth = Clothes.type();
	System.out.println("The type of colth is :"+typeOfCloth);
	

	}
	
	
}
