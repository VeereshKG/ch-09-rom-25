class  Ipl{
	
// static String rcb = "RCB";
// static String csk = "CSK";
// static String mi = "MI";
// static String srh = "SRH";
// static String pbks = "PBKS";
// static String lsg = "LSG";
// static String gt = "GT";
// static String kkr = "KKR";
// static String rr = "RR";
// static String dc = "DC";

// static String teamNames[] = {rcb,csk,mi,srh,pbks,lsg,gt,kkr,rr,dc};
	
public static void main (String[] teams){
 // String teamNames[] = {"RCB","CSK","MI","SRH","PBKS","LSG","GT","KKR","RR","DC"};
 
// System.out.println("IPL Teams : "+" "+teamNames[0]+" "+teamNames[1]+" "+teamNames[2]+" "+teamNames[3]+" "+teamNames[4]+ " "+teamNames[5]+" "+teamNames[6]+" "+teamNames[7]+" "+teamNames[8]+" "+teamNames[9]);

String rcb = "RCB";
String csk = "CSK";
String mi = "MI";
String srh = "SRH";
String pbks = "PBKS";
String lsg = "LSG";
String gt = "GT";
String kkr = "KKR";
String rr = "RR";
String dc = "DC";

String teamNames[] = {rcb,csk,mi,srh,pbks,lsg,gt,kkr,rr,dc};

System.out.println("IPL Teams : ");
 for(String teamName : teamNames){
	 
	 System.out.println(teamName);
 }
}
}