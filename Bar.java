class Bar{

static String alcoholNames[] = {"Amaretto","Bacardi","CanadianWhisky","DeanSton","ImperialBlue","JohnnyWalker","KingFisher","OldMonk","BlackDog","RedLabel","AfterDark","AbsolutElyx"};

public static void main(String []alcohol){

// System.out.println("Name of the alcoholic Brands : j"+" "+alcoholNames[0]+" "+alcoholNames[1]+" "+alcoholNames[2]+" "+alcoholNames[3]+" "+alcoholNames[4]+" "+alcoholNames[5]+" "+alcoholNames[6]+" "+alcoholNames[7]+" "+alcoholNames[8]+" "+alcoholNames[9]+" "+alcoholNames[10]+" "+alcoholNames[11]);

System.out.println("Name of the alcoholic Brands :");
for(String alcoholName:alcoholNames){
	System.out.println(alcoholName);
}
}}