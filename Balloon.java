class Balloon{
	
	int baloonid;
	String color;
	double price;
	String material;
    String shape;
	String types;
	
	
	Balloon(){
	   this(1,"pink");
	   System.out.println("default constructor is invoked");
   }
   
   Balloon(int BalloonId,String color){
	   this(100.0,"rubber");
	      System.out.println("BalloonId color parameterized constructor is invoked");
		  this.BalloonId = BalloonId;
		  this.color = color;
   }
   
   Balloon(double price,String material){
	   this("round","latex");
	      System.out.println("two parameterized constructor is invoked");
		  this.price = price;
		  this.material = material;
   }
   
   Balloon(String shape,String types){
	   this(1);
	      System.out.println("two String parameterized constructor is invoked");
		  this.shape = shape;
		  this.types = types;
   }
   
   Balloon(int BalloonId){
	   this(1,"pink",55.0,"rubber","latex","round");
	      System.out.println("BalloonId parameterized constructor is invoked");
		  this.BalloonId = BalloonId;
   }
   
   Balloon(double price){
	   this();
	      System.out.println("price parameterized constructor is invoked");
		  this.price = price;
   }
   
   Balloon(int BalloonId,String color,double price,String material,String shape,String types){
	      System.out.println("parameterized constructor is invoked");
		  this.BalloonId = BalloonId;
		  this.color = color;
		  this.price = price;
		  this.material = material;
		  this.shape = shape;
		  this.types = types;
   }
   
    public void display(){
       System.out.println("the WaterBallId is "+waterBallId);
	   System.out.println("the color is "+color);
	   System.out.println("the price is "+price);
	   System.out.println("the size is "+material);
	   System.out.println("shape is "+shape);
	   System.out.println("waterBall types "+types);
	   System.out.println("-----------------------------");
}
	
	

}