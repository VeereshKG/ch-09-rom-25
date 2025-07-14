class InstagramValidator{
	
	static String email;
    static String password;
    static String fullName;
    static String username;
    static long mobileNumber;
	
	public static boolean validateuser(String eMail, String passcode, String fName, String userName, long phoneNumber) {
		
		boolean isValidationDone = false;
		 boolean isValidEmail = false;
        boolean isValidPassword = false;
        boolean isValidFullName = false;
        boolean isValidUserName = false;
        boolean isValidMobileNumber = false;

        if (eMail != null) {
            email = eMail;
            isValidEmail = true;
        } else {
            System.out.println("Enter a valid email");
        }

        if (passcode != null) {
            password = passcode;
            isValidPassword = true;
        } else {
            System.out.println("Enter a valid password");
        }

        if (fName != null) {
            fullName = fName;
            isValidFullName = true;
        } else {
            System.out.println("Enter a valid full name");
        }

        if (userName != null) {
            username = userName;
            isValidUserName = true;
        } else {
            System.out.println("Enter a valid username");
        }

        if (phoneNumber != 0) {
            mobileNumber = phoneNumber;
            isValidMobileNumber = true;
        } else {
            System.out.println("Enter a valid mobile number");
        }

        if (isValidEmail && isValidPassword && isValidFullName && isValidUserName && isValidMobileNumber) {
            System.out.println("All Instagram registration details are valid");
            isValidationDone = true;
        }
		return isValidationDone;
	}

}