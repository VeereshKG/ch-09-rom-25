class GunRunner{
	
	public static void main(String []gun){
		
		Gun gun1 = new Gun();
		gun1.display();
		
		
		Gun gun2 = new Gun(1);
		System.out.println("th gun id is "+gun2.gunId);
		System.out.println("--------------------");
		
		Gun gun3 = new Gun("toy");
	   System.out.println("the type is "+gun3.type);
	   System.out.println("--------------------");
	   
	   Gun gun4 = new Gun(50.0);
	   System.out.println("the price of gun is "+gun4.price);
	   System.out.println("--------------------");
	   
	   Gun gun5 = new Gun(1,"toy",50.0,"blue","10m","Medium");
		gun5.display();
		
		Gun gun6 = new Gun(1,"toy",50.0);
		System.out.println("th gun id is "+gun6.gunId);
	   System.out.println("the type is "+  gun6.type);
	   System.out.println("the price of gun is "+gun6.price);
	   System.out.println("--------------------");
		
		Gun gun7 = new Gun("blue","10m","Medium");
		System.out.println("the color is "+gun7.color);
	   System.out.println("the range is "+ gun7.range);
	   System.out.println("the size is "+  gun7.size);
		System.out.println("--------------------");
		
		
		
		
	}
}