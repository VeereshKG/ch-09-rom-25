class Cooler{
	static boolean onOrOff;
	static int currentTemperature = 2;
	static int maxTemperature =4;
	static int minTemperature = 0;
	
	public static void onOrOff(){
		if(onOrOff==false)
			if(onOrOff=true){
				System.out.println("the cooler is on :"+onOrOff);
			}
			else{
				System.out.println("the cooler is off :"+onOrOff);
			}
	}
	public static void increaseTemperature(){
		if(onOrOff==true)
			if(currentTemperature<maxTemperature){
				currentTemperature = currentTemperature+1;
				System.out.println("the currentTemperature of cooler is "+currentTemperature);
			}else{
				System.out.println("Maximum temperature  reched"+currentTemperature);
				
			}
			else{
				System.out.println("turn on cooler");
				
			}	
	}
	public static void decreaseTemperature(){
		if(onOrOff==true)
			if(currentTemperature>minTemperature){
				currentTemperature = currentTemperature-1;
				System.out.println("the current temperature of cooler "+currentTemperature);
			}else{
				System.out.println("Minimum temperature reached"+currentTemperature);
			}
			else{
				System.out.println("turn on cooler");
				
			}
	}


}