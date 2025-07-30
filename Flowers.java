class Flowers{
	
	int flowerId;
	String name;
	String colors[];
	double price;
	String origin;
	boolean isFragrant;
	
	Flowers() {

    }
	
		Flowers(int flowerId, String name){
			this.flowerId = flowerId;
		    this.name = name;
		}
		Flowers(String colors[], double price){
			this.colors = colors;
		    this.price = price;
		}
		Flowers(String origin, boolean isFragrant) {
		this.origin = origin;
		this.isFragrant = isFragrant;
	}
	
	
	
	public void getFlowersInfo(){
	   System.out.println("the colors are");			
			for(String  color:colors )
				System.out.println(color);
	}
}