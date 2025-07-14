class Spotify{
	
	static String emailAddress;
	static String password;
	static String name;
	static String dateOfBirth;
	static char gender;
	
	public static boolean signUp(String givenEmail,String pwd,String givenName,String dob,char givenGender){
		
		boolean isSignUPDone = false;
		boolean emailAddressValid= false;
		boolean passwordValid = false;
		boolean nameValid = false;
		boolean dateOfBirthValid = false;
		boolean genderValid = false;
		
		
		if(givenEmail !=null){
		emailAddress	= givenEmail;
		emailAddressValid = true;
		}else System.out.println("enter EmailId");
		
		if(pwd !=null){
		password	= pwd	;
		passwordValid = true;
		}else System.out.println("enter valid password");
		
		if(givenName !=null){
		name	= givenName;
		nameValid = true;
		}else System.out.println("enter a name for your profile");
		
		if(dob !=null){
		dateOfBirth	= dob;
		dateOfBirthValid = true;
		}else System.out.println("please enter your valid dateOfBirth");
		
		if(givenGender != null){
		gender	= givenGender;
		genderValid = true;
		}else System.out.println("select your gender correctly");
		
		if(emailAddressValid && passwordValid && nameValid && dateOfBirthValid && genderValid){
			isSignUPDone = true ;
		}
		return isSignUPDone;
	}
	public static void getSignUpDetails(){
		System.out.println("the given emailAddress is "+emailAddress);
		System.out.println("the password is "+password);
		System.out.println("given name for profile is "+name);
		System.out.println("date Of Birth is "+dateOfBirth);
		System.out.println("gender is "+gender);
		
		
	}
}