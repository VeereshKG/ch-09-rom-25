class NetWorkRunner {
	public static void main(String[] network) {

		NetWork ref1 = new NetWork(1, "JioFiber");
        System.out.println("the network id is " + ref1.networkId);
		System.out.println("the name is " + ref1.name);
		
		NetWork ref2 = new NetWork("Broadband", "Reliance");
		System.out.println("the type is " + ref2.type);
		System.out.println("the provider is " + ref2.provider);
		
		NetWork ref3 = new NetWork(150.0, 399.0);
		System.out.println("the speed is " + ref3.speed);
		System.out.println("the price is " + ref3.price);
	
	}

}
