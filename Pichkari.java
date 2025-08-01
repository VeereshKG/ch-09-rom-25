class Pichkari{

    int pichkariId;
	String type;
	String material;
	String color;
	double price;
	char size;
	
	 Pichkari(){
	   this(50.0);
	  System.out.println("default constructor is invoked");
	   
   }
   
   Pichkari(int pichkariId){
	   
	   System.out.println("pichkariId para constructor is invoked");
	  this.pichkariId = pichkariId; 
   }
   
   Pichkari(String type){
	   this(1);
	   System.out.println("type para constructor is invoked");
	   this.type = type;
   }
   
   Pichkari(double price){
	   this("toy");
	   System.out.println("price para constructor is invoked");
	  this.price = price ;
   }
   
   Pichkari(int pichkariId,String type,double price,String color,String material,char size){
	   this();
	   System.out.println("parameterized constructor is invoked");
	   this.pichkariId = pichkariId;
	   this.type = type;
	   this.price = price;
	   this.color = color;
	   this.material = material;
	   this.size = size;   
   }
   
   Pichkari(String color,String material,char size){
	   this(1,"toy",50.0,"blue","10m",'M');
	   System.out.println("string para constructor is invoked");
	   this.color = color;
	   this.material = material;
	   this.size = size;
   }
   
   Pichkari(int pichkariId,String type,double price){
	   this();
	   System.out.println("three para constructor is invoked");
	   this.pichkariId = pichkariId;
	   this.type = type;
	   this.price = price;
   }
   
   public void display(){
	   System.out.println("th Pichkari id is "+pichkariId);
	   System.out.println("the type is "+type);
	   System.out.println("the price of Pichkari is "+price);
	   System.out.println("the color is "+color);
	   System.out.println("the material is "+material);
	   System.out.println("the size is "+size);
	   System.out.println("--------------------");
}
}