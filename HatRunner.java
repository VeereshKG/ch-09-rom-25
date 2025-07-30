class HatRunner {

	public static void main(String[] hat) {

		Hat ref1 = new Hat(1, "Adidas");
		System.out.println("the hat id is " + ref1.hatId);
		System.out.println("the brand is " + ref1.brand);
		
		String colors[] = {"black","white","brown"};
		Hat ref2 = new Hat(colors, "M", "Baseball");
		ref2.getHatInfo();
		System.out.println("the size is " + ref2.size);
		System.out.println("the type is " + ref2.type);
		
		Hat ref3 = new Hat(499.0);
		System.out.println("the price is " + ref3.price);
	
	}
}
