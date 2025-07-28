class Pipe{
	
	
    Pipe() {
        System.out.println("the constructor is invoked");
    }

    Pipe(int pipeId, String brand, String type, double length, double diameter, double price) {
        System.out.println("the parameterized constructor is invoked");

        this.pipeId = pipeId;
        this.brand = brand;
        this.type = type;
        this.length = length;
        this.diameter = diameter;
        this.price = price;
    }
	
	int pipeId;
	String brand;
	String type;
	double length;
	double diameter;
	double price;
	
	public void getPipeInfo(){
		
		System.out.println("the pipe id is " + pipeId);
		System.out.println("the brand is " + brand);
		System.out.println("the type is " + type);
		System.out.println("the length is " + length);
		System.out.println("the diameter is " + diameter);
		System.out.println("the price is " + price);
		System.out.println("");
		
	}
}