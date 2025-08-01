class Holi{

    int holiId;
	String colorsUsed;
	int price;
	boolean isHoliFestival;
	boolean isHoliReligiousFestival;
	String brand;
	
	Holi(){
		this(1,"black",25,true,true,"Tota");
		 System.out.println("default constructor is invoked");
	}
	
	Holi(int holiId){
		this();
		 System.out.println("holiId parameterized constructor is invoked");
		this.holiId = holiId;
	}
	
	
	Holi(int holiId,int price){
		this(true,true);
		  System.out.println("holiId  price parameterized constructor is invoked");
		this.holiId = holiId;
		this.price = price;
	}
	
	Holi(boolean isHoliFestival,boolean isHoliReligiousFestival){
		this(1);
		 System.out.println("boolean parameterized constructor is invoked");
		this.isHoliFestival = isHoliFestival;
		this.isHoliReligiousFestival  = isHoliReligiousFestival;
	}
	
	Holi(int holiId,String colorsUsed,int price,boolean isHoliFestival,boolean isHoliReligiousFestival,String brand){
		 System.out.println(" parameterized constructor is invoked");
		this.holiId = holiId;
		this.colorsUsed = colorsUsed;
		this.price = price;
		this.isHoliFestival = isHoliFestival;
		this.isHoliReligiousFestival  = isHoliReligiousFestival;
		this.brand = brand;
	}
	
	Holi(String brand){
		this(1,25);
		 System.out.println("brand parameterized constructor is invoked");
		this.brand = brand;
	}
	
	Holi(boolean isHoliFestival){
		 System.out.println("isHoliFestival parameterized constructor is invoked");
		this.isHoliFestival = isHoliFestival;
	}
	
	public void display(){
		System.out.println("the holi id is "+holiId);
		System.out.println("the colorsUsed are "+colorsUsed);
		System.out.println("the price is "+price);
		System.out.println("the isHoliFestival  "+isHoliFestival);
		System.out.println("isHoliReligiousFestival "+isHoliReligiousFestival);
		System.out.println("the brand is "+brand);
		 System.out.println("-----------------------------");
		
	}

}
