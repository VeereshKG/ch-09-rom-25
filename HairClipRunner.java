class HairClipRunner {

	public static void main(String[] clip) {

		HairClip ref1 = new HairClip(1, "Scunci");
		System.out.println("the hair clip id is " + ref1.clipId);
		System.out.println("the brand is " + ref1.brand);
		
		String colors[] = {"black","blue","red"};
		HairClip ref2 = new HairClip(15.0,colors);
		System.out.println("the price of hair clip is " + ref2.price);
		ref2.getHairClipInfo();
		
		HairClip ref3 = new HairClip("Plastic", "Medium");
		System.out.println("the material of hair clip is " + ref3.material);
		System.out.println("the size of hair clip is " + ref3.size);
	
	}
}
