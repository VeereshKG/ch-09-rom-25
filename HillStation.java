class HillStation{

// static String islandVibes = "IslandVibes";
// static String gamyamRatreat = "GamyamRatreat";
// static String coorgWilderness = "CoorgWilderness";
// static String greenGarden = "GreenGarden";
// static String dandeliTiger = "DandeliTiger";
// static String theMeraki = "TheMeraki";
// static String woodSide = "WoodSide";
// static String sandyShores= "SandyShores";
// static String greenHills = "GreenHills";
// static String trippr = "Trippr";

// static String resorts[] = {islandVibes,gamyamRatreat,coorgWilderness,greenGarden,dandeliTiger,theMeraki,woodSide,sandyShores,greenHills,trippr};

// static String resorts[] = {"IslandVibes","GamyamRatreat","CoorgWilderness","GreenGarden","DandeliTiger","TheMeraki","WoodSide","SandyShores","GreenHills","Trippr"};

public static void main(String []hill){

// System.out.println("The HillStation Resorts in Karnataka are"+ " "+resorts[0]+" "+resorts[1]+" "+resorts[2]+" "+resorts[3]+" "+resorts[4]+" "+resorts[5]+" "+resorts[6]+" "+resorts[7]+" "+resorts[8]+" "+resorts[9]);

 String islandVibes = "IslandVibes";
 String gamyamRatreat = "GamyamRatreat";
 String coorgWilderness = "CoorgWilderness";
 String greenGarden = "GreenGarden";
 String dandeliTiger = "DandeliTiger";
 String theMeraki = "TheMeraki";
 String woodSide = "WoodSide";
 String sandyShores= "SandyShores";
 String greenHills = "GreenHills";
 String trippr = "Trippr";
 
 String resorts[] = {islandVibes,gamyamRatreat,coorgWilderness,greenGarden,dandeliTiger,theMeraki,woodSide,sandyShores,greenHills,trippr};

System.out.println("The HillStation Resorts in Karnataka are :");
for(String resort:resorts){
	System.out.println(resort);
}

}
}