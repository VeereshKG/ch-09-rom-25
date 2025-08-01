class TomatoRunner{
	
	public static void main(String []tomat){
		
		Tomato tomato1 = new Tomato();
		tomato1.display();
		
		Tomato tomato2 = new Tomato(1);
	   System.out.println("the tomatoId is "+tomato2.tomatoId);
	   System.out.println("-----------------------------");
	   
	   Tomato tomato3 = new Tomato("cherry","red");
	   System.out.println("the type is "+  tomato3.type);
	   System.out.println("the color is "+ tomato3.color);
	   System.out.println("-----------------------------");
	   
	   Tomato tomato4 = new Tomato(true);
	   System.out.println("istasty "+tomato4.istasty);
	   System.out.println("-----------------------------");
	   
	   Tomato tomato5 = new Tomato(50.0);
	   System.out.println("the price is "+tomato5.price);
	   System.out.println("-----------------------------");
	   
	   Tomato tomato6 = new Tomato(true,50.0,"small");
	   System.out.println("istasty "+ tomato6.istasty);
	   System.out.println("the price is "+tomato6.price);
	   System.out.println("the size is "+ tomato6.size);
	   System.out.println("-----------------------------");
	   
	   Tomato tomato7 = new Tomato(1,"cherry","red",true,50.0,"small");
	   tomato7.display();
		
	}
}