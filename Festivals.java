class Festivals{
	
	Festivals() {
        System.out.println("the constructor is invoked");
    }

    Festivals(int festivalId, String name, String state, String month, String type) {
        System.out.println("the parameterized constructor is invoked");
        this.festivalId = festivalId; 
        this.name = name;
        this.state = state;
        this.month = month;
        this.type = type;
    }
	
	int festivalId;
    String name;
    String state;
    String month;
    String type;
	
	public void getFestivals(){
		System.out.println("The festival id is " + festivalId);
		System.out.println("the name is " + name);
		System.out.println("the state is " + state);
		System.out.println("the month is " + month);
		System.out.println("the type is " + type);
		System.out.println("");
	}
}