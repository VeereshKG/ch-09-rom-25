class Twitter{
	
	static String fullName;
	static String emailId;
	static String dateOfBirth;
	
	public static boolean createAccount(String fName,String givenEmail,String dob){
		
		boolean isAccountCreated = false;
		
		boolean isvalidation = Twittervalidator.userValidation(fName,givenEmail,dob);
		
		if(isvalidation == true){
			isAccountCreated = true;
		}else System.out.println("twitter account is not created");
		// boolean fullNameValid = false;
		// boolean emailIdValid = false;
		// boolean dateOfBirthValid = false;
		
		// if(fName != null){
		// fullName	= fName;
		// fullNameValid = true;
		// }else System.out.println("enter valid name");
		
		// if(givenEmail != null){
		// emailId	= givenEmail;
		// emailIdValid = true;
		// }else System.out.println("enter valid emailId");
		
		// if(dob != null){
		// dateOfBirth	= dob;
		// dateOfBirthValid = true;
		// }else System.out.println("enter valid dateOfBirth");
		
		// if(fullNameValid && emailIdValid && dateOfBirthValid){
			// isAccountCreated = true;
		// }
		return isAccountCreated;
	}
	
	public static void getAccountDetails(){
		
		fullName = Twittervalidator.fullName;
		emailId = Twittervalidator.emailId;
		dateOfBirth = Twittervalidator.dateOfBirth;
		
		System.out.println("given name is "+fullName);
		System.out.println("given emailId "+emailId);
		System.out.println("date of birth provided "+dateOfBirth);

	}



}