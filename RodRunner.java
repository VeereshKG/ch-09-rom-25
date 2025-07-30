class RodRunner {
	
    public static void main(String[] rod) {

        Rod ref1 = new Rod(1, "Steel");
        System.out.println("the rod id is " + ref1.rodId);
		System.out.println("the material is " + ref1.material);
		
		Rod ref2 = new Rod(2.5, 15.0);
		System.out.println("the length is " + ref2.length);
		System.out.println("the weight is " + ref2.weight);
		
		Rod ref3 = new Rod("Construction", 450.0);
		System.out.println("the usage is " + ref3.usage);
		System.out.println("the price is " + ref3.price);
		
    }
}

