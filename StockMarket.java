class StockMarket{

static String stockNames[] = {"RelianceInustriesLtd","HDFCBankLtd","TataConsultancyServicesLtd","HindustanUnileverLtd","ICICBankLtd","InfosysLtd","BhartiAirtelLtd","ITCLtd","HCLTechnologiesLtd","Mahindra&MahindraLtd"};

public static void main(String []stock){

// System.out.println("companies registered in stock market : "+" "+stockNames[0]+" "+stockNames[1]+" "+stockNames[2]+" "+stockNames[3]+" "+stockNames[4]+" "+stockNames[5]+" "+stockNames[6]+" "+stockNames[7]+" "+stockNames[8]+" "+stockNames[9]);

System.out.println("companies registered in stock market :");
for(String stockName:stockNames){
	System.out.println(stockName);
}

}
}