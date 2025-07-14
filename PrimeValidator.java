class PrimeValidator{
	
		static String fullName;
	static long mobileNumber;
	static String password;
	
	public static boolean uservalidation(String fName,long number,String pwd){
		
		boolean isvalidation = false;
			boolean fullNameValid = false;
		boolean mobileNumberValid = false;
		boolean passwordValid = false;
		
		if(fName != null){
		fullName	= fName;
		fullNameValid = true;
		}else System.out.println("enter valid name");
		
		if(number != 0){
		mobileNumber	= number;
		mobileNumberValid = true;
		}else System.out.println("enter valid mobile number");
		
		if(pwd != null){
		password	= pwd;
		passwordValid = true;
		}else System.out.println("enter valid password");
		
		if(fullNameValid && mobileNumberValid && passwordValid){
			isvalidation = true;
		}
		return isvalidation;
		
	}
}