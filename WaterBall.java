class WaterBall{

   int waterBallId;
   String color;
   double price;
   String material;
   String shape;
   String contains;
   
   WaterBall(){
	   this(1,"pink");
	   System.out.println("default constructor is invoked");
   }
   
   WaterBall(int waterBallId,String color){
	   this(100.0,"rubber");
	      System.out.println("waterBallId color parameterized constructor is invoked");
		  this.waterBallId = waterBallId;
		  this.color = color;
   }
   
   WaterBall(double price,String material){
	   this("round","water");
	      System.out.println("two parameterized constructor is invoked");
		  this.price = price;
		  this.material = material;
   }
   
   WaterBall(String shape,String contains){
	   this(1);
	      System.out.println("two String parameterized constructor is invoked");
		  this.shape = shape;
		  this.contains = contains;
   }
   
   WaterBall(int waterBallId){
	   this(1,"pink",55.0,"rubber","water","round");
	      System.out.println("waterBallId parameterized constructor is invoked");
		  this.waterBallId = waterBallId;
   }
   
   WaterBall(double price){
	   this();
	      System.out.println("price parameterized constructor is invoked");
		  this.price = price;
   }
   
   WaterBall(int waterBallId,String color,double price,String material,String shape,String contains){
	      System.out.println("parameterized constructor is invoked");
		  this.waterBallId = waterBallId;
		  this.color = color;
		  this.price = price;
		  this.material = material;
		  this.shape = shape;
		  this.contains = contains;
   }
   
   public void display(){
       System.out.println("the WaterBallId is "+waterBallId);
	   System.out.println("the color is "+color);
	   System.out.println("the price is "+price);
	   System.out.println("the size is "+material);
	   System.out.println("shape is "+shape);
	   System.out.println("waterBall contains "+contains);
	   System.out.println("-----------------------------");
}
}