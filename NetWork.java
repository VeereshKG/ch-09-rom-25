class NetWork{
	
	NetWork() {
        System.out.println("the NetWork constructor is invoked");
    }

    NetWork(int networkId, String name, String type, String provider, double speed, double price) {
        System.out.println("the parameterized NetWork constructor is invoked");

        this.networkId = networkId;
        this.name = name;
        this.type = type;
        this.provider = provider;
        this.speed = speed;
        this.price = price;
    }
	int networkId;
	String name;
	String type;
	String provider;
	double speed;
	double price;
	
	public void getNetworkInfo(){
		System.out.println("the network id is " + networkId);
		System.out.println("the name is " + name);
		System.out.println("the type is " + type);
		System.out.println("the provider is " + provider);
		System.out.println("the speed is " + speed);
		System.out.println("the price is " + price);
		System.out.println("");
		
	}
}