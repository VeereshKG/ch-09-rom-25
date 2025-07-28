class Fish{
	
	    Fish() {
        System.out.println("the constructor is invoked");
    }

    Fish(int fishId, String name, String species, double weight, String color, String origin) {
        System.out.println("the parameterized constructor is invoked");
        this.fishId = fishId;
        this.name = name;
        this.species = species;
        this.weight = weight;
        this.color = color;
        this.origin = origin;
    }
	
	int fishId;
	String name;
	String species;
	double weight;
	String color;
	String origin;
	
	public void getFishInfo(){
		System.out.println("the fish id is " + fishId);
		System.out.println("the name is " + name);
		System.out.println("the species is " + species);
		System.out.println("the weight is " + weight);
		System.out.println("the color is " + color);
		System.out.println("origin is " + origin);
		System.out.println("");
	}
}