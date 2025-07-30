public class HairClip {
	
	int clipId;
	String brand;
	double price;
	String colors[];
	String material;
	String size;
	
	   HairClip() {

    }

    HairClip(int clipId, String brand){
		this.clipId = clipId;
        this.brand = brand;
	}
	HairClip(double price, String colors[]){
		this.price = price;
        this.colors = colors;
	}
	HairClip(String material, String size) {
        this.material = material;
        this.size = size;
    }
	
	
	
	public void getHairClipInfo(){
		
	System.out.println("the colors available are");			
			for(String color :colors )
				System.out.println(color);
		}
}