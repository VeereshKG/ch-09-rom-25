class PichkariRunner{
	
	public static void main(String []kari){
		
		Pichkari pichkari1 = new Pichkari();
		pichkari1.display();
		
		
		Pichkari pichkari2 = new Pichkari(1);
		System.out.println("th Pichkari id is "+pichkari2.pichkariId);
		System.out.println("--------------------");
		
		Pichkari pichkari3 = new Pichkari("toy");
	   System.out.println("the type is "+pichkari3.type);
	   System.out.println("--------------------");
	   
	   Pichkari pichkari4 = new Pichkari(50.0);
	   System.out.println("the price of Pichkari is "+pichkari4.price);
	   System.out.println("--------------------");
	   
	   Pichkari pichkari5 = new Pichkari(1,"toy",50.0,"blue","10m",'M');
		pichkari5.display();
		
		Pichkari pichkari6 = new Pichkari(1,"toy",50.0);
		System.out.println("th Pichkari id is "+pichkari6.pichkariId);
	   System.out.println("the type is "+  pichkari6.type);
	   System.out.println("the price of Pichkari is "+pichkari6.price);
	   System.out.println("--------------------");
		
		Pichkari pichkari7 = new Pichkari("blue","10m",'M');
		System.out.println("the color is "+pichkari7.color);
	   System.out.println("the material is "+ pichkari7.material);
	   System.out.println("the size is "+  pichkari7.size);
		System.out.println("--------------------");
		
		
		
		
	}

}