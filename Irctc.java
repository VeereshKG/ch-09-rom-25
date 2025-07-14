class Irctc{
	static String userName;
	static String fullName;
	static String password;
    static String confirmPassword;
	static String email;
	static long mobile;
	
	public static boolean accountCreate(String uName,String fName,String pword,String confirmPword,String mail,long phone){
		
		boolean isAccountCreated = false;
		boolean userNameValid = false;
		boolean fullNameValid = false;
		boolean passwordValid = false;
		boolean confirmPasswordValid = false;
		boolean emailValid = false;
		boolean mobileValid = false;
		
		if(uName != null){
			userName = uName;
			userNameValid = true;
		}else System.out.println("user Name not valid");
		
		if (fName != null){
			fullName = fName;
			fullNameValid =  true;	
		}else System.out.println("fullName is not valid");
		
		if(pword != null){
			password = pword;
			passwordValid = true;
		}else System.out.println("enter valid password");
		
		if (confirmPword != null && confirmPword == password){
			confirmPassword = confirmPword;
		   confirmPasswordValid =  true;	
		}else System.out.println("password doesnt match");
		
			if(mail != null){
			email = mail;
			emailValid = true;
			}else System.out.println("enter valid email");
			
		if (phone != 0){
			mobile = phone;
			mobileValid =  true;	
		}else System.out.println("provide valid mobile number");
		
		if(userNameValid == true && fullNameValid == true && passwordValid == true && confirmPasswordValid == true && emailValid == true && mobileValid == true){
			isAccountCreated = true;
		}
		return isAccountCreated;
	}
		public static void getUser(){
			System.out.println("the user Name :"+userName);
			System.out.println("the Full name of user is  :"+fullName);
			System.out.println("the password :"+password);
			System.out.println("the confirmPassword  :"+confirmPassword);
			System.out.println("the user email id :"+email);
			System.out.println("the user phone number :"+mobile);
	
	}
}