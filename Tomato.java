class Tomato{

   int tomatoId;
   String type;
   String color;
   boolean istasty;
   double price;
   String size;
   
   Tomato(){
	   this(1,"cherry","red",true,50.0,"small");
	   System.out.println("default constructor is invoked");
   }
   
   Tomato(int tomatoId){
	   this(true,50.0,"small");
	   System.out.println("tomatoId parameterized constructor is invoked");
	   this.tomatoId = tomatoId;
   }
   
   Tomato(String type,String color){
	   this(50.0);
	   System.out.println("two String parameterized constructor is invoked");
	   this.type = type;
	   this.color = color;
   }
   
   Tomato(boolean istasty){
	   this("cherry","red");
	   System.out.println("istasty parameterized constructor is invoked");
	   this.istasty = istasty;
   }
   
   Tomato(double price){
	   this(1);
	   System.out.println("price parameterized constructor is invoked");
	   this.price  = price;
   }
   
   Tomato(boolean istasty,double price,String size){
	   this();
	   System.out.println("three parameterized constructor is invoked");
	    this.istasty = istasty;
		this.price  = price;
		this.size = size;
   }
   
   Tomato(int tomatoId,String type,String color,boolean istasty,double price,String size){
	   System.out.println("parameterized constructor is invoked");
	   this.tomatoId = tomatoId;
	   this.type = type;
	   this.color = color;
	   this.istasty = istasty;
		this.price  = price;
		this.size = size;
   }
   
   public void display(){
       System.out.println("the tomatoId is "+tomatoId);
	   System.out.println("the type is "+type);
	   System.out.println("the color is "+color);
	   System.out.println("istasty "+istasty);
	   System.out.println("the price is "+price);
	   System.out.println("the size is "+size);
	   System.out.println("-----------------------------");
}
}