class Fan{
	static boolean onOrOff;
	static int currentSpeed = 1;
	static int maxSpeed =5;
	static int minSpeed = 0;
	
	public static void onOrOff(){
		if(onOrOff==false)
			if(onOrOff=true){
				System.out.println("the fan is on :"+onOrOff);
			}
			else{
				System.out.println("the fan is off :"+onOrOff);
			}
	}
	public static void increaseSpeed(){
		if(onOrOff==true)
			if(currentSpeed<maxSpeed){
				currentSpeed = currentSpeed+1;
				System.out.println("the currentSpeed of Fan is "+currentSpeed);
			}else{
				System.out.println("Maximum Speed reached"+currentSpeed);
				
			}
			else{
				System.out.println("turn on Fan");
				
			}	
	}
	public static void decreaseSpeed(){
		if(onOrOff==true)
			if(currentSpeed>minSpeed){
				currentSpeed = currentSpeed-1;
				System.out.println("the current Speed of Fan "+currentSpeed);
			}else{
				System.out.println("Minimum Speed reached"+currentSpeed);
			}
			else{
				System.out.println("turn on Fan");
				
			}
	}


}