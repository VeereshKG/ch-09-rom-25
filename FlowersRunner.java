class FlowersRunner {

	public static void main(String[] flower) {

		Flowers ref1 = new Flowers(1, "Rose");
		System.out.println("the flower id is " + ref1.flowerId);
		System.out.println("the flower name is " + ref1.name);
		
		String colors[] = {"White","blue"};
	    Flowers ref2 = new Flowers(colors, 15.0);
		ref2.getFlowersInfo();
		System.out.println("the price is " + ref2.price);
		
		Flowers ref3 = new Flowers("Netherlands", false);
		System.out.println("the origin is " + ref3.origin);
		System.out.println("is it fragrant " + ref3.isFragrant);
		
	}
}