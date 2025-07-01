class Earth{

// static String  asia = "Asia";
// static String africa = "Africa";
// static String northAmerica = "NorthAmerica";
// static String southAfrica = "SouthAmerica";
// static String antarctica = "Antarctica";
// static String europe = "Europe";
// static String australia = "Australia";

// static String continents[] = {asia,africa,northAmerica,southAfrica,antarctica,europe,australia};

// static String continents[] = {"Asia","Africa","NorthAmerica","SouthAmerica","Antarctica","Europe","Australia",};

public static void main(String []earth){

// System.out.println("names of the seven continents : "+" "+continents[0]+" "+continents[1]+" "+continents[2]+" "+continents[3]+" "+continents[4]+" "+continents[5]+" "+continents[6]);

String  asia = "Asia";
String africa = "Africa";
String northAmerica = "NorthAmerica";
String southAfrica = "SouthAmerica";
String antarctica = "Antarctica";
String europe = "Europe";
String australia = "Australia";

String continents[] = {asia,africa,northAmerica,southAfrica,antarctica,europe,australia};


System.out.println("names of the seven continents : ");

for(String continent : continents){
	
	System.out.println(continent);
}
}
}