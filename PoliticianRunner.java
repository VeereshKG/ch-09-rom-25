class PoliticianRunner {
	
    public static void main(String[] politician) {

        Politician ref1 = new Politician(1);
        System.out.println("the politician id is " + ref1.politicianId);
		
		Politician ref2 = new Politician("Narendra Modi", "BJP");
		System.out.println("the name is " + ref2.name);
		System.out.println("the party is " +ref2. party);
		
		Politician ref3 = new Politician("Prime Minister", 73);
		System.out.println("the position is " + ref3.position);
		System.out.println("the age is " + ref3.age);
	
    }
}
