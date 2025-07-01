class PeriodicTable{

// static String  hydrogen = "Hydrogen";
// static String  helium = "Helium";
// static String  lithium = "Lithium";
// static String  boron = "Boron";
// static String carbon = "Carbon";
// static String  nitrogen = "Nitrogen";
// static String  oxygen = "Oxygen";
// static String fluorine = "Fluorine";
// static String  neon = "Neon";
// static String  sodium = "Sodium";
// static String  magnesium = "Magnesium";
// static String  aluminium = "Aluminium";

// static String elements[] = {hydrogen,helium,lithium,boron,carbon,nitrogen,oxygen,fluorine,neon,sodium,magnesium,aluminium};

// static String elements[] = {"Hydrogen","Helium","Lithium","Boron","Carbon","Nitrogen","Oxygen","Fluorine","Neon","Sodium","Magnesium","Aluminium"};

public static void main(String []table){

// System.out.println("Elements Of Periodic Table : "+" "+elements[0]+" "+elements[1]+" "+elements[2]+" "+elements[3]+" "+elements[4]+" "+elements[5]+" "+elements[6]+" "+elements[7]+" "+elements[8]+" "+elements[9]+" "+elements[10]+" "+elements[11]);

 String  hydrogen = "Hydrogen";
 String  helium = "Helium";
 String  lithium = "Lithium";
 String  boron = "Boron";
 String carbon = "Carbon";
 String  nitrogen = "Nitrogen";
 String  oxygen = "Oxygen";
 String fluorine = "Fluorine";
 String  neon = "Neon";
 String  sodium = "Sodium";
 String  magnesium = "Magnesium";
 String  aluminium = "Aluminium";

 String elements[] = {hydrogen,helium,lithium,boron,carbon,nitrogen,oxygen,fluorine,neon,sodium,magnesium,aluminium};

System.out.println("Elements Of Periodic Table :");
for(String element:elements){
	System.out.println(element);
}
}
}