class NailPolishRunner{
	
	public static void main(String []nail){
		
		
		NailPolish nail1 = new NailPolish();
		nail1.display();
		
		NailPolish nail2 = new NailPolish(1);
	   System.out.println("the nailPolishId is "+nail2.nailPolishId);
	   System.out.println("-----------------------------");
	   
	   NailPolish nail3 = new NailPolish("lakme","red");
	   System.out.println("the brand is "+nail3.brand);
	   System.out.println("the color is "+nail3.color);
	   System.out.println("-----------------------------");
	   
	   NailPolish nail4 = new NailPolish(100.0);
	   System.out.println("the price is "+nail4.price);
	   System.out.println("-----------------------------");
	   
	   NailPolish nail5 = new NailPolish(true);
	   System.out.println("isPolishRemoval "+nail5.isPolishRemoval);
	   System.out.println("-----------------------------");
	   
	   NailPolish nail6 = new NailPolish("lakme","red","gel");
	   System.out.println("the brand is "+nail6.brand);
	   System.out.println("the color is "+nail6.color);
	   System.out.println("the type is "+ nail6.type);
	   System.out.println("-----------------------------");
	   
	   NailPolish nail7 = new NailPolish(1,"lakme","red",100.0,true,"gel");
		nail7.display();
		
	}
}