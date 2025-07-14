class Twittervalidator{
	
		static String fullName;
	static String emailId;
	static String dateOfBirth;
	
	public static boolean userValidation(String fName,String givenEmail,String dob){
		
		boolean isvalidation = false;
				boolean fullNameValid = false;
		boolean emailIdValid = false;
		boolean dateOfBirthValid = false;
		
		if(fName != null){
		fullName	= fName;
		fullNameValid = true;
		}else System.out.println("enter valid name");
		
		if(givenEmail != null){
		emailId	= givenEmail;
		emailIdValid = true;
		}else System.out.println("enter valid emailId");
		
		if(dob != null){
		dateOfBirth	= dob;
		dateOfBirthValid = true;
		}else System.out.println("enter valid dateOfBirth");
		
		if(fullNameValid && emailIdValid && dateOfBirthValid){
			isvalidation = true;
		}
		return isvalidation;
	}

}