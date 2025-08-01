class Gun{

   int    gunId;
   String type;
   double price;
   String color;
   String range;
   String size;
   
    Gun(){
	   
	  System.out.println("default constructor is invoked");
	   
   }
   
   Gun(int gunId){
	   this();
	   System.out.println("gunid para constructor is invoked");
	  this.gunId = gunId; 
   }
   
   Gun(String type){
	   this(1);
	   System.out.println("type para constructor is invoked");
	   this.type = type;
   }
   
   Gun(double price){
	   this("toy");
	   System.out.println("price para constructor is invoked");
	  this.price = price ;
   }
   
   Gun(int gunId,String type,double price,String color,String range,String size){
	   this(50.0);
	   System.out.println("parameterized constructor is invoked");
	   this.gunId = gunId;
	   this.type = type;
	   this.price = price;
	   this.color = color;
	   this.range = range;
	   this.size = size;   
   }
   
   Gun(String color,String range,String size){
	   this(1,"toy",50.0,"blue","10m","Medium");
	   System.out.println("string para constructor is invoked");
	   this.color = color;
	   this.range = range;
	   this.size = size;
   }
   
   Gun(int gunId,String type,double price){
	   this();
	   System.out.println("three para constructor is invoked");
	   this.gunId = gunId;
	   this.type = type;
	   this.price = price;
   }
   
   public void display(){
	   System.out.println("th gun id is "+gunId);
	   System.out.println("the type is "+type);
	   System.out.println("the price of gun is "+price);
	   System.out.println("the color is "+color);
	   System.out.println("the range is "+range);
	   System.out.println("the size is "+size);
	   System.out.println("--------------------");
	   
	   
   }
}