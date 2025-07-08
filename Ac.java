class Ac{
	static boolean onOrOff;
	static int currentTemperature = 3;
	static int maxTemperature =5;
	static int minTemperature = 0;
	
	public static void onOrOff(){
		if(onOrOff==false)
			if(onOrOff=true){
				System.out.println("the AC is on :"+onOrOff);
			}
			else{
				System.out.println("the AC is off :"+onOrOff);
			}
	}
	public static void increaseTemperature(){
		if(onOrOff==true)
			if(currentTemperature<maxTemperature){
				currentTemperature = currentTemperature+1;
				System.out.println("the currentTemperature of AC is "+currentTemperature);
			}else{
				System.out.println("Maximum temperature reached"+currentTemperature);
				
			}
			else{
				System.out.println("turn on AC");
				
			}	
	}
	public static void decreaseTemperature(){
		if(onOrOff==true)
			if(currentTemperature>minTemperature){
				currentTemperature = currentTemperature-1;
				System.out.println("the current temperature of Ac "+currentTemperature);
			}else{
				System.out.println("Minimum temperature reached"+currentTemperature);
			}
			else{
				System.out.println("turn on AC");
				
			}
	}


}