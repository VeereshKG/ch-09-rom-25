class HoliRunner{
	
	public static void main(String []holi){
		
		
		Holi holi1 = new Holi();
		holi1.display();
		
		Holi holi2 = new Holi(1);
		System.out.println("the holi id is "+holi2.holiId);
		System.out.println("-----------------------------");
		
		Holi holi3 = new Holi(1,25);
		System.out.println("the holi id is "+holi3.holiId);
		System.out.println("the price is "+holi3.price);
		System.out.println("-----------------------------");
		
		Holi holi4 = new Holi(true,true);
		System.out.println("the isHoliFestival  "+holi4.isHoliFestival);
		System.out.println("isHoliReligiousFestival "+holi4.isHoliReligiousFestival);
		System.out.println("-----------------------------");
		
		Holi holi5 = new Holi(1,"black",25,true,true,"Tota");
		holi5.display();
		
		Holi holi6 = new Holi("Tota");
		System.out.println("the brand is "+holi6.brand);
		System.out.println("-----------------------------");
		
		Holi holi7 = new Holi(true);
		System.out.println("the isHoliFestival  "+holi7.isHoliFestival);
		System.out.println("-----------------------------");
	}

}