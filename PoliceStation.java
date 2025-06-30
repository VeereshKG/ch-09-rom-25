class PoliceStation {
	
    static int stationId;
    static String stationName;
    static String location;
    static String city;
    static String state;
    static String country;
    static int establishedYear;
    static int numberOfOfficers;
    static int numberOfVehicles;
    static boolean isWomenCell;
    static boolean isCyberCell;
    static int emergency;
    static long contactNumber;
    static String emailID;
    static String headOfficerName;
    static String jurisdiction;
    static boolean isSurveillanceEnabled;
    static int numberOfCCTV;
    static String status;
	static String timing;

    public static void main(String[] station) {
        System.out.println("Station ID is " + stationId);
        System.out.println("Station Name " + stationName);
        System.out.println("Location of Station: " + location);
        System.out.println("City " + city);
        System.out.println("State" + state);
        System.out.println("Country" + country);
        System.out.println("Established in the Year " + establishedYear);
        System.out.println("Number of Officers " + numberOfOfficers);
        System.out.println("Number of Vehicles " + numberOfVehicles);
        System.out.println("is Women Cell available " + isWomenCell);
        System.out.println("is Cyber Cell available " + isCyberCell);
        System.out.println("emergency number is " + emergency);
        System.out.println("Contact Number " + contactNumber);
        System.out.println("Email ID " + emailID);
        System.out.println("Head Officer name is" + headOfficerName);
        System.out.println("Jurisdiction  " + jurisdiction);
        System.out.println("is Surveillance Enabled " + isSurveillanceEnabled);
        System.out.println("Number of CCTVs " + numberOfCCTV);
        System.out.println("Status " + status);
        System.out.println("open timing " + timing);
		
    stationId = 022;
    stationName = "MG Road Police Station";
    location = "MG Road, Bengaluru";
    city = "Bengaluru";
    state = "Karnataka";
    country = "India";
    establishedYear = 2002;
    numberOfOfficers = 50;
    numberOfVehicles = 15;
    isWomenCell = true;
    isCyberCell = false;
    emergency= 112;
    contactNumber = 98022223344l;
    emailID = "mgroadps@gmail.com";
    headOfficerName = "Inspector Ravi Kumar";
    jurisdiction = "Central Bengaluru";
    isSurveillanceEnabled = true;
    numberOfCCTV = 10;
    status = "Active";
	timing = "24x7";
	
	    System.out.println("Station ID is " + stationId);
        System.out.println("Station Name " + stationName);
        System.out.println("Location of Station: " + location);
        System.out.println("City " + city);
        System.out.println("State" + state);
        System.out.println("Country" + country);
        System.out.println("Established in the Year " + establishedYear);
        System.out.println("Number of Officers " + numberOfOfficers);
        System.out.println("Number of Vehicles " + numberOfVehicles);
        System.out.println("is Women Cell available " + isWomenCell);
        System.out.println("is Cyber Cell available " + isCyberCell);
        System.out.println("emergency number is " + emergency);
        System.out.println("Contact Number " + contactNumber);
        System.out.println("Email ID " + emailID);
        System.out.println("Head Officer name is" + headOfficerName);
        System.out.println("Jurisdiction  " + jurisdiction);
        System.out.println("is Surveillance Enabled " + isSurveillanceEnabled);
        System.out.println("Number of CCTVs " + numberOfCCTV);
        System.out.println("Status " + status);
        System.out.println("open timing " + timing);
    }
}
