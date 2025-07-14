class SpotifyValidator{
    
	static String emailAddress;
	static String password;
	static String name;
	static String dateOfBirth;
	static char gender;

   public   static boolean validateUser(String givenEmail,String pwd,String givenName,String dob,char givenGender ){

        boolean    isUserValidted = false; 
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
		
		if(givenGender !=' '){
		gender	= givenGender;
		genderValid = true;
		}else System.out.println("select your gender correctly");
		
		if(emailAddressValid && passwordValid && nameValid && dateOfBirthValid && genderValid){
			isUserValidted = true;
		
		}
		return isUserValidted;
}}