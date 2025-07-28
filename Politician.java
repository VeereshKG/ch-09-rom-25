class Politician{
	
	  Politician() {
        System.out.println("the constructor is invoked");
    }

    Politician(int politicianId, String name, String party, String position, int age) {
        System.out.println("the parameterized constructor is invoked");

        this.politicianId = politicianId;
        this.name = name;
        this.party = party;
        this.position = position;
        this.age = age;
    }
	int politicianId;
	String name;
	String party;
	String position;
	int age;
	
	public void getPoliticianInfo(){
		
		System.out.println("the politician id is " + politicianId);
		System.out.println("the name is " + name);
		System.out.println("the party is " + party);
		System.out.println("the position is " + position);
		System.out.println("the age is " + age);
		System.out.println("");
		
	}
}

