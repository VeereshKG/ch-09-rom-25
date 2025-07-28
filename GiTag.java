class GiTag{
	
	  GiTag() {
        System.out.println("the constructor is invoked");
    }

    GiTag(int id, String productName, String state, int yearOfRegistration, String category) {
        System.out.println("the parameterized constructor is invoked");

        this.id = id;
        this.productName = productName;
        this.state = state;
        this.yearOfRegistration = yearOfRegistration;
        this.category = category;
    }
	
	int id;
    String productName;
    String state;
    int yearOfRegistration;
    String category;
	
	public void getGiTagInfo(){
			System.out.println("the id is " + id);
		System.out.println("the product name is " + productName);
		System.out.println("the state is " + state);
		System.out.println("the year of registration is " + yearOfRegistration);
		System.out.println("the category is " + category);
		System.out.println("");
		
	}
}