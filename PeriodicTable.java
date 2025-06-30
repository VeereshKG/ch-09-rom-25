class PeriodicTable{

static String elements[] = {"Hydrogen","Helium","Lithium","Boron","Carbon","Nitrogen","Oxygen","Fluorine","Neon","Sodium","Magnesium","Aluminium"};

public static void main(String []table){

// System.out.println("Elements Of Periodic Table : "+" "+elements[0]+" "+elements[1]+" "+elements[2]+" "+elements[3]+" "+elements[4]+" "+elements[5]+" "+elements[6]+" "+elements[7]+" "+elements[8]+" "+elements[9]+" "+elements[10]+" "+elements[11]);

System.out.println("Elements Of Periodic Table :");
for(String element:elements){
	System.out.println(element);
}
}
}