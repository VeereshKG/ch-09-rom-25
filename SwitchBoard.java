class SwitchBoard {
	
    static int switchBoardId;
    static String brand;
    static String model;
    static int numberOfSwitches;
    static int numberOfSockets;
    static String color;
    static String material;
    static boolean isFanSwitch;
    static String installationType;
    static String warranty;
    static String voltage;
    static String currentRating;
    static boolean surgeProtection;
    static String manufacturingDate;
    static String manufacturer;
    static String countryOfOrigin;
    static long customerCareNumber;
    static String customerSupportEmail;
    static String status;
	static boolean Indicator;

    public static void main(String[]  havells) {
        System.out.println("ID of the SwitchBoard " + switchBoardId);
        System.out.println("Brand name is" + brand);
        System.out.println("Model of SwitchBoard " + model);
        System.out.println("Number of Switches are " + numberOfSwitches);
        System.out.println("Number of Sockets are " + numberOfSockets);
        System.out.println("Indicator is available " + Indicator);
        System.out.println("Color of SwitchBoard " + color);
        System.out.println("Material used " + material);
        System.out.println("is fan Switch available " + isFanSwitch);
        System.out.println("Installation Type is " + installationType);
        System.out.println("Warranty for SwitchBoard " + warranty);
        System.out.println("Voltage  " + voltage );
        System.out.println("Current Rating " + currentRating);
        System.out.println("isSurge Protection  Available" + surgeProtection);
        System.out.println("Manufacturing Date " + manufacturingDate);
        System.out.println("Manufacturer " + manufacturer);
        System.out.println("Country of Origin " + countryOfOrigin);
        System.out.println("Customer Care Number " + customerCareNumber);
        System.out.println("Customer Support Email " + customerSupportEmail);
        System.out.println("Switch is " + status);
		
	switchBoardId = 001;
    brand = "Havells";
    model = "HSB 2023";
    numberOfSwitches = 8;
    numberOfSockets = 3;
    color = "White";
    material = "Polycarbonate";
    isFanSwitch = true;
    installationType = "Wall mounted";
    warranty = "5 years";
    voltage = "240V";
    currentRating = "16A";
    surgeProtection = true;
    manufacturingDate = "22/06/2025";
    manufacturer = "Havells India Ltd.";
    countryOfOrigin = "India";
    customerCareNumber = 1800110303L;
    customerSupportEmail = "support@havells.com";
    status = "Operational";
	Indicator = true;

        System.out.println("ID of the SwitchBoard " + switchBoardId);
        System.out.println("Brand name is" + brand);
        System.out.println("Model of SwitchBoard " + model);
        System.out.println("Number of Switches are " + numberOfSwitches);
        System.out.println("Number of Sockets are " + numberOfSockets);
        System.out.println("Indicator is available " + Indicator);
        System.out.println("Color of SwitchBoard " + color);
        System.out.println("Material used " + material);
        System.out.println("is fan Switch available " + isFanSwitch);
        System.out.println("Installation Type is " + installationType);
        System.out.println("Warranty for SwitchBoard " + warranty);
        System.out.println("Voltage  " + voltage );
        System.out.println("Current Rating " + currentRating);
        System.out.println("isSurge Protection  Available" + surgeProtection);
        System.out.println("Manufacturing Date " + manufacturingDate);
        System.out.println("Manufacturer " + manufacturer);
        System.out.println("Country of Origin " + countryOfOrigin);
        System.out.println("Customer Care Number " + customerCareNumber);
        System.out.println("Customer Support Email " + customerSupportEmail);
        System.out.println("Switch is " + status);	
    }
}
