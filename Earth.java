class Earth{

static String continents[] = {"Asia","Africa","NorthAmerica","SouthAmerica","Antarctica","Europe","Australia",};

public static void main(String []earth){

// System.out.println("names of the seven continents : "+" "+continents[0]+" "+continents[1]+" "+continents[2]+" "+continents[3]+" "+continents[4]+" "+continents[5]+" "+continents[6]);

System.out.println("names of the seven continents : ");

for(String continent : continents){
	
	System.out.println(continent);
}
}
}