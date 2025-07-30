class CrackersRunner {

	public static void main(String[] cracker) {
		
		
         String brands[] = { "Standard","Shivakasi"};
		Crackers ref1 = new Crackers(1, "Flower Pot",brands);
		System.out.println("the id is "+ref1.crackerId);
		System.out.println("the cracker name is " + ref1.name);
		ref1.getCrackers();
		
		Crackers ref2 = new Crackers(50.0, "Visual");	
		System.out.println("the price is " + ref2.price);
		System.out.println("the type is " + ref2.type);
		
		Crackers ref3 = new Crackers(false);		
		System.out.println("is it loud " + ref3.isLoud);
		
	}
}
