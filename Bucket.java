class Bucket{

    int bucketId;
	String material;
	String color;
	String brand;
	double price;
	String size;
	
	
	 Bucket(){
	   this(50.0);
	  System.out.println("default constructor is invoked");
	   
   }
   
   Bucket(int bucketId){
	   
	   System.out.println("BucketId para constructor is invoked");
	  this.bucketId = bucketId; 
   }
   
   Bucket(String brand){
	   this(1);
	   System.out.println("brand para constructor is invoked");
	   this.brand = brand;
   }
   
   Bucket(double price){
	   this("ltr");
	   System.out.println("price para constructor is invoked");
	  this.price = price ;
   }
   
   Bucket(int bucketId,String brand,double price,String color,String material,String size){
	   this();
	   System.out.println("parameterized constructor is invoked");
	   this.bucketId = bucketId;
	   this.brand = brand;
	   this.price = price;
	   this.color = color;
	   this.material = material;
	   this.size = size;   
   }
   
   Bucket(String color,String material,String size){
	   this(1,"ltr",50.0,"blue","10m","20L");
	   System.out.println("string para constructor is invoked");
	   this.color = color;
	   this.material = material;
	   this.size = size;
   }
   
   Bucket(int BucketId,String brand,double price){
	   this();
	   System.out.println("three para constructor is invoked");
	   this.bucketId = bucketId;
	   this.brand = brand;
	   this.price = price;
   }
   
   public void display(){
	   System.out.println("th Bucket id is "+bucketId);
	   System.out.println("the brand is "+brand);
	   System.out.println("the price of Bucket is "+price);
	   System.out.println("the color is "+color);
	   System.out.println("the material is "+material);
	   System.out.println("the size is "+size);
	   System.out.println("--------------------");
}
}