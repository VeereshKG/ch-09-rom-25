class Naukri{
	
	static String fullName;
	static String emailId;
	static String password;
	static long mobileNumber;
	static String workStatus;
	
	public static boolean createYourNaukriProfile(String fName,String givenEmail,String pwd,long number,String work){
		
		boolean isProfileCreated = false;
		
	boolean	isValidation = NaukriValidator.validation(fName,givenEmail,pwd,number,work);
		
		if(isValidation == true){
			isProfileCreated = true;
		}else System.out.println("profile is not created");
		// boolean fullNameValid = false;
		// boolean emailIdValid = false;
		// boolean passwordValid = false;
		// boolean mobileNumberValid = false;
		// boolean workStatusValid = false;
		
		// if(fName != null){
		// fullName	= fName;
		// fullNameValid = true;
		// }else System.out.println("enter valid name");
		
		// if(givenEmail != null){
		// emailId	= givenEmail;
		// emailIdValid = true;
		// }else System.out.println("enter valid emailId");
		
		// if(pwd != null){
		// password	= pwd;
		// passwordValid = true;
		// }else System.out.println("enter valid password");
		
		// if(number != 0){
		// mobileNumber	= number;
		// mobileNumberValid = true;
		// }else System.out.println("enter valid mobileNumber");
		
		// if(work != null){
		// workStatus	= work;
		// workStatusValid = true;
		// }else System.out.println("enter valid workStatus");
		
		// if(fullNameValid && emailIdValid && passwordValid && mobileNumberValid && workStatusValid){
			// isProfileCreated = true;
		// }
		return isProfileCreated;
	}
	
	public static void getProfileDetails(){
		
		fullName = NaukriValidator.fullName;
		emailId = NaukriValidator.emailId;
		password = NaukriValidator.password;
		mobileNumber = NaukriValidator.mobileNumber;
		workStatus = NaukriValidator.workStatus;
		
		System.out.println("given name is "+fullName);
		System.out.println("given emailId "+emailId);
		System.out.println("password provided "+password);
		System.out.println("mobileNumber  "+mobileNumber);
		System.out.println("workStatus is "+workStatus);
		
		
		
		

	}



}