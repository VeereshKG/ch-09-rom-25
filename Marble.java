class Marble{
	
	Marble() {
        System.out.println("the Marble constructor is invoked");
    }

    Marble(int marbleId, String color, String shape, double diameter, boolean isPolished) {
        System.out.println("the parameterized Marble constructor is invoked");

        this.marbleId = marbleId;
        this.color = color;
        this.shape = shape;
        this.diameter = diameter;
        this.isPolished = isPolished;
    }
	
	int marbleId;
	String color;
	String shape;
	double diameter;
	boolean isPolished;
	
	public void getMarbleInfo(){
		System.out.println("the marble id is " + marbleId);
		System.out.println("the color is " + color);
		System.out.println("the shape is " + shape);
		System.out.println("the diameter is " + diameter);
		System.out.println("is polished  " + isPolished);
		System.out.println("");
		
	}
}