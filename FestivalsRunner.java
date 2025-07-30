class FestivalsRunner {
    public static void main(String[] festival) {

        Festivals ref1 = new Festivals(1);
       System.out.println("The festival id is " + ref1.festivalId);
	   
	   String names[] = {"Diwali","Holi"};
	   Festivals ref2 = new Festivals(names, "All India", "October");
		ref2.getFestivals();
		System.out.println("the state is " +ref2. state);
		System.out.println("the month is " +ref2. month);
		
		Festivals ref3 = new Festivals("Religious");
		System.out.println("the type is " + ref3.type);
      
    }
}


   
