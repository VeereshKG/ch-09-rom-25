class NailPolish{

    int nailPolishId;
	String brand;
	String color;
	double price;
	boolean isPolishRemoval;
	String type;
	
	
	NailPolish(){
		this(1);
		System.out.println("default constructor is invoked");
	}
	
	NailPolish(int nailPolishId){
		this("lakme","red");
		System.out.println(" nailPolishId parameterized constructor is invoked");
		this.nailPolishId = nailPolishId;
	}
	
	NailPolish(String brand,String color){
		this(100.0);
		System.out.println(" two String parameterized constructor is invoked");
		this.brand = brand;
		this.color = color;
	}
	
	
	NailPolish(double price){
		this(true);
		System.out.println("one double parameterized constructor is invoked");
		this.price = price;
	}
	
	NailPolish(boolean isPolishRemoval){
		this("lakme","red","gel");
		System.out.println("one boolean parameterized constructor is invoked");
		this.isPolishRemoval = isPolishRemoval;
	}
	
	NailPolish(String brand,String color,String type){
		this(1,"lakme","red",100.0,true,"gel");
		System.out.println("three String parameterized constructor is invoked");
		this.brand = brand;
		this.color = color;
		this.type = type;
	}
	
	NailPolish(int nailPolishId,String brand,String color,double price,boolean isPolishRemoval,String type){
		System.out.println("parameterized constructor is invoked");
		this.nailPolishId = nailPolishId;
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.isPolishRemoval = isPolishRemoval;
		this.type = type;
	}
	
	public void display(){
	   System.out.println("the nailPolishId is "+nailPolishId);
	   System.out.println("the brand is "+brand);
	   System.out.println("the color is "+color);
	   System.out.println("the price is "+price);
	   System.out.println("isPolishRemoval "+isPolishRemoval);
	   System.out.println("the type is "+type);
	   System.out.println("-----------------------------");
}
}