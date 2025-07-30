class FishRunner {

	public static void main(String[] fish) {

		Fish ref1 = new Fish(1, "Nemo");
		System.out.println("the fish id is " + ref1.fishId);
		System.out.println("the name is " + ref1.name);
		
		Fish ref2 = new Fish("Clownfish", 0.2, "Orange");
		System.out.println("the species is " + ref2.species);
		System.out.println("the weight is " + ref2.weight);
		System.out.println("the color is " + ref2.color);
		
		Fish ref3 = new Fish("Pacific Ocean");
		System.out.println("origin is " + ref3.origin);
	
	}
}
