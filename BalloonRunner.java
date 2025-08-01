class BalloonRunner{
	
	public static void main(String []baloon){
		
		WaterBall ball01 = new WaterBall();
		ball01.display();
		
		WaterBall ball2 = new WaterBall(1,"pink");
	   System.out.println("the WaterBallId is "+ball2.waterBallId);
	   System.out.println("the color is "+ball2.color);
	   System.out.println("-----------------------------");
		  
	   WaterBall ball3 = new WaterBall(55.0,"rubber");
	   System.out.println("the price is "+ball3.price);
	   System.out.println("the size is "+ ball3.material);
	      System.out.println("-----------------------------");
	   
	   WaterBall ball4 = new WaterBall("latex","round");
	   System.out.println("waterBall contains "+ball4.contains);
	   System.out.println("shape is "+ball4.shape);
	   System.out.println("-----------------------------");
	   
	   WaterBall ball5 = new WaterBall(1);
	   System.out.println("the WaterBallId is "+ball5.waterBallId);
	   System.out.println("-----------------------------");
	   
	   WaterBall ball6 = new WaterBall(55.0);
	   System.out.println("the price is "+ball6.price);
	   System.out.println("-----------------------------");
	   
	   WaterBall ball7 = new WaterBall(1,"pink",55.0,"rubber","latex","round");
	   ball7.display();
		
		
	}
}