class Tv{

 static  boolean onOrOff;
static int maxVolume = 15;
static int minVolume;
static int currentVolume = 7;

public static void onOrOff(){
 if(onOrOff == false){
 onOrOff = true;
 System.out.println("the Tv is on");
 }else{
 onOrOff = false;
 System.out.println("the Tv is off");
 }
 
   }
//increase volume
public static void increasevolume(){
if(onOrOff == true)
if(currentVolume < maxVolume){
currentVolume = currentVolume+1;
System.out.println("the Current volume is"+currentVolume);
}
else{
System.out.println("max volume reached");
}
else{
	System.out.println(" turn on Tv");
}
}

//decrease volume

public static void decreaseVolume(){
	if(onOrOff == true)
		if(minVolume<currentVolume){
			currentVolume = currentVolume-1;
               System.out.println("the Current volume is"+currentVolume);
			}else{
				System.out.println("min volume reached");
			}
		else{
			System.out.println("please turn on Tv");
		}	
}
}






