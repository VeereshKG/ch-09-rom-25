class MarbleRunner {

	public static void main(String[] marble) {

		Marble ref1 = new Marble(1, "White");
		System.out.println("the marble id is " + ref1.marbleId);
		System.out.println("the color is " + ref1.color);
		
		Marble ref2 = new Marble("Round", 2.5);
		System.out.println("the shape is " + ref2.shape);
		System.out.println("the diameter is " + ref2.diameter);
		
		Marble ref3 = new Marble(true);
		System.out.println("is polished  " + ref3.isPolished);
		
	}
}  
