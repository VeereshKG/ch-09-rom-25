class Instagram{

    static String email;
    static String password;
    static String fullName;
    static String username;
    static long mobileNumber;

    public static boolean registrationUser(String eMail, String passcode, String fName, String userName, long phoneNumber) {

        boolean isRegistrationUser = false;
		
		boolean isValidationDone = InstagramValidator.validateuser(eMail,passcode,fName,userName,phoneNumber);
		
	  if(isValidationDone == true){
		  isRegistrationUser = true;
	  }else System.out.println("the account is not created");
	  
        // boolean isValidEmail = false;
        // boolean isValidPassword = false;
        // boolean isValidFullName = false;
        // boolean isValidUserName = false;
        // boolean isValidMobileNumber = false;

        // if (eMail != null) {
            // email = eMail;
            // isValidEmail = true;
        // } else {
            // System.out.println("Enter a valid email");
        // }

        // if (passcode != null) {
            // password = passcode;
            // isValidPassword = true;
        // } else {
            // System.out.println("Enter a valid password");
        // }

        // if (fName != null) {
            // fullName = fName;
            // isValidFullName = true;
        // } else {
            // System.out.println("Enter a valid full name");
        // }

        // if (userName != null) {
            // username = userName;
            // isValidUserName = true;
        // } else {
            // System.out.println("Enter a valid username");
        // }

        // if (phoneNumber != 0) {
            // mobileNumber = phoneNumber;
            // isValidMobileNumber = true;
        // } else {
            // System.out.println("Enter a valid mobile number");
        // }

        // if (isValidEmail && isValidPassword && isValidFullName && isValidUserName && isValidMobileNumber) {
            // System.out.println("All Instagram registration details are valid");
            // isRegistrationUser = true;
        // }

        return isRegistrationUser;
    }

    public static void getDetails() {
		email = InstagramValidator.email;
		password = InstagramValidator.password;
		fullName = InstagramValidator.fullName;
		username = InstagramValidator.username;
		mobileNumber = InstagramValidator.mobileNumber;
		
        System.out.println("Email    : " + email);
        System.out.println("Password  : " + password);
        System.out.println("Full Name: " + fullName);
        System.out.println("Username: " + username);
        System.out.println("Mobile Number: " + mobileNumber);
    }
}
