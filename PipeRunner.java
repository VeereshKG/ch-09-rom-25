class PipeRunner {

	public static void main(String[] pipe) {

		Pipe ref1 = new Pipe(1, "Supreme");
		System.out.println("the pipe id is " + ref1.pipeId);
		System.out.println("the brand is " + ref1.brand);
		
		Pipe ref2 = new Pipe("PVC", 10.0);
		System.out.println("the type is " + ref2.type);
		System.out.println("the length is " + ref2.length);
		
		Pipe ref3 = new Pipe(2.0, 250.0);
		System.out.println("the diameter is " + ref3.diameter);
		System.out.println("the price is " + ref3.price);
		
	}

}
