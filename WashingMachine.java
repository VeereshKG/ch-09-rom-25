class WashingMachine{
	static boolean onOrOff;
	static int currentSpeed = 2;
	static int maxSpeed = 5;
	static int minSpeed;
	
	public static void onOrOff(){
		if(onOrOff==false)
			if(onOrOff=true){
				System.out.println("WashingMachine is on "+onOrOff);
			}else{
				System.out.println("washing machine is off"+onOrOff);
			}
	}
	public static void increaseSpeed(){
		if(onOrOff == true)
			if(currentSpeed<maxSpeed){
				currentSpeed = currentSpeed+1;
					System.out.println("the currentSpeed of washing machine is"+currentSpeed);
				}else{
					System.out.println("the maxSpeed reached"+currentSpeed);
				}
				else{
					System.out.println("turn on washing machine");
				}
			
	}
	public static void decreaseSpeed(){
		if(onOrOff==true)
			if(currentSpeed>minSpeed){
				currentSpeed = currentSpeed-1;
				System.out.println("the currentSpeed of washing machine is"+currentSpeed);
			}
			else{
				System.out.println("the minimum Speed of washing machine is reached "+currentSpeed);
			}
			else{
				System.out.println("turn on washing machine");
			}
	}
	
	

}