class JwelleryRunner {

	public static void main(String[] jwellery) {

		Jwellery ref1 = new Jwellery(1, "Necklace", "Gold");
		System.out.println("the jwelleryId is "+ref1.jwelleryId);
		System.out.println("the type is " + ref1.type);
		System.out.println("the metal is " + ref1.metal);
		
		Jwellery ref2 = new Jwellery(15.0, 75000.0);
		System.out.println("the weight is " +ref2.weight);
		System.out.println("the price is " + ref2.price);
		
		String designs[] = {"Traditional","etnic"};
		Jwellery ref3 = new Jwellery(designs);
		ref3.getJwelleryInfo();

	}
}
