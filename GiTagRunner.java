class GiTagRunner {

    public static void main(String[] tag) {

        GiTag ref1 = new GiTag(1, "Mysore Silk", "Karnataka");
        System.out.println("the id is " + ref1.id);
		System.out.println("the product name is " + ref1.productName);
		System.out.println("the state is " + ref1.state);
		
		GiTag ref2 = new GiTag(2004);
		System.out.println("the year of registration is " + ref2.yearOfRegistration);
		
		GiTag ref3 = new GiTag("Textile");
		System.out.println("the category is " + ref3.category);
        
    }
}
