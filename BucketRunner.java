class BucketRunner{
	
	public static void main(String []bucket){
		
		Bucket bucket1 = new Bucket();
		bucket1.display();
		
		
		Bucket bucket2 = new Bucket(1);
		System.out.println("th Bucket id is "+bucket2.bucketId);
		System.out.println("--------------------");
		
		Bucket bucket3 = new Bucket("ltr");
	   System.out.println("the brand is "+bucket3.brand);
	   System.out.println("--------------------");
	   
	   Bucket bucket4 = new Bucket(50.0);
	   System.out.println("the price of Bucket is "+bucket4.price);
	   System.out.println("--------------------");
	   
	   Bucket bucket5 = new Bucket(1,"ltr",50.0,"blue","10m",'M');
		bucket5.display();
		
		Bucket bucket6 = new Bucket(1,"ltr",50.0);
		System.out.println("th Bucket id is "+bucket6.bucketId);
	   System.out.println("the brand is "+  bucket6.brand);
	   System.out.println("the price of Bucket is "+bucket6.price);
	   System.out.println("--------------------");
		
		Bucket bucket7 = new Bucket("blue","10m",'M');
		System.out.println("the color is "+bucket7.color);
	   System.out.println("the material is "+ bucket7.material);
	   System.out.println("the size is "+  bucket7.size);
		System.out.println("--------------------");
		
		
		
	}
}