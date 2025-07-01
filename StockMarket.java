class StockMarket{

// static String  relianceInustriesLtd = "RelianceInustriesLtd";
// static String hdfcBankLtd = "HDFCBankLtd";
// static String tataConsultancyServicesLtd = "TataConsultancyServicesLtd";
// static String hindustanUnileverLtd = "HindustanUnileverLtd";
// static String icicBankLtd = "ICICBankLtd";
// static String  infosysLtd = "InfosysLtd";
// static String bhartiAirtelLtd = "BhartiAirtelLtd";
// static String itcLtd = "ITCLtd";
// static String hclTechnologiesLtd = "HCLTechnologiesLtd";
// static String MahindraLtd = "Mahindra&MahindraLtd";

// static String stockNames[] = {relianceInustriesLtd,hdfcBankLtd,tataConsultancyServicesLtd,hindustanUnileverLtd,icicBankLtd,infosysLtd,bhartiAirtelLtd,itcLtd,hclTechnologiesLtd,MahindraLtd};

// static String stockNames[] = {"RelianceInustriesLtd","HDFCBankLtd","TataConsultancyServicesLtd","HindustanUnileverLtd","ICICBankLtd","InfosysLtd","BhartiAirtelLtd","ITCLtd","HCLTechnologiesLtd","Mahindra&MahindraLtd"};

public static void main(String []stock){

// System.out.println("companies registered in stock market : "+" "+stockNames[0]+" "+stockNames[1]+" "+stockNames[2]+" "+stockNames[3]+" "+stockNames[4]+" "+stockNames[5]+" "+stockNames[6]+" "+stockNames[7]+" "+stockNames[8]+" "+stockNames[9]);

 String  relianceInustriesLtd = "RelianceInustriesLtd";
 String hdfcBankLtd = "HDFCBankLtd";
 String tataConsultancyServicesLtd = "TataConsultancyServicesLtd";
 String hindustanUnileverLtd = "HindustanUnileverLtd";
 String icicBankLtd = "ICICBankLtd";
 String  infosysLtd = "InfosysLtd";
 String bhartiAirtelLtd = "BhartiAirtelLtd";
 String itcLtd = "ITCLtd";
 String hclTechnologiesLtd = "HCLTechnologiesLtd";
 String MahindraLtd = "Mahindra&MahindraLtd";

 String stockNames[] = {relianceInustriesLtd,hdfcBankLtd,tataConsultancyServicesLtd,hindustanUnileverLtd,icicBankLtd,infosysLtd,bhartiAirtelLtd,itcLtd,hclTechnologiesLtd,MahindraLtd};


System.out.println("companies registered in stock market :");
for(String stockName:stockNames){
	System.out.println(stockName);
}

}
}