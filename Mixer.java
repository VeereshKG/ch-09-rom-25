class Mixer{
	static boolean onOrOff;
	static int currentSpeed = 1;
	static int maxSpeed = 3;
	static int minSpeed;
	
	public static void onOrOff(){
		if(onOrOff==false)
			if(onOrOff=true){
				System.out.println("the mixer is on :"+onOrOff)	;
			}
		else{
				System.out.println("the mixeris off:"+onOrOff)	;
		}
	}
	public static void increseSpeed(){
		if(onOrOff==true)
			if(currentSpeed<maxSpeed){
				currentSpeed = currentSpeed+1;
				System.out.println("the current Speed is: "+currentSpeed);
			}
			else{
                System.out.println("maximum speed reached");
			}
			else{
                System.out.println("turn on the mixer");	
			}
		}
		public  static void decreaseSpeed(){
			if(onOrOff==true)
				if(currentSpeed>minSpeed){
					currentSpeed = currentSpeed-1;
					System.out.println("currentSpeed of the mixer is"+currentSpeed);
				}
				else{
                System.out.println("minimum speed reached");
					
				}
				else{
                System.out.println("turn on the mixer");	
					
				}
			
			
			
			
			
		}
}