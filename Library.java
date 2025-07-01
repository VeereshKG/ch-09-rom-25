class Library{

// static String theWhiteTiger = "TheWhiteTiger";
// static String aSuitableBoy  = "ASuitableBoy";
// static String theNamesake   = "TheNamesake";
// static String seaOfPoppies  = "SeaOfPoppies";
// static String indiaAfterGandhi  = "IndiaAfterGandhi";
// static String maximumCity = "MaximumCity";
// static String buddhistIndia = "BuddhistIndia";
// static String aryanRuleIndia = "AryanRuleIndia";

// static String bookNames[]  = {theWhiteTiger,aSuitableBoy,theNamesake,seaOfPoppies,indiaAfterGandhi,maximumCity,buddhistIndia,aryanRuleIndia};

// static String bookNames[] = {"TheWhiteTiger","ASuitableBoy","TheNamesake","SeaOfPoppies","IndiaAfterGandhi","MaximumCity","BuddhistIndia","AryanRuleIndia",};

public static void main(String []book){
// System.out.println("Book Names Available in the Library : "+" "+bookNames[0]+" "+bookNames[1]+" "+bookNames[2]+" "+bookNames[3]+" "+bookNames[4]+" "+bookNames[5]+" "+bookNames[6]+" "+bookNames[7]);

 String theWhiteTiger = "TheWhiteTiger";
 String aSuitableBoy  = "ASuitableBoy";
 String theNamesake   = "TheNamesake";
 String seaOfPoppies  = "SeaOfPoppies";
 String indiaAfterGandhi  = "IndiaAfterGandhi";
 String maximumCity = "MaximumCity";
 String buddhistIndia = "BuddhistIndia";
 String aryanRuleIndia = "AryanRuleIndia";
 
 String bookNames[]  = {theWhiteTiger,aSuitableBoy,theNamesake,seaOfPoppies,indiaAfterGandhi,maximumCity,buddhistIndia,aryanRuleIndia};

System.out.println("Book Names Available in the Library : ");
for(String bookName:bookNames){
	System.out.println(bookName);
}
}
}