class Facebook{
	static String firstName;
	static String surName;
	static String dateOfBirth;
	static String gender;
	static long contact;
	static String email;
	static String password;
	
	public static boolean accountCreate(String fName,String sName,String dob,String gen,long mobile,String mail,String pword){
		
		boolean isAccountCreated = false;
		boolean firstNameValid = false;
		boolean surNameValid = false;
		boolean dateOfBirthValid = false;
		boolean genderValid = false;
		boolean contactValid = false;
		boolean emailValid = false;
		boolean passwordValid = false;
		
		if(fName != null){
			firstName = fName;
			firstNameValid = true;
		}else System.out.println("firstName is not valid");
		if (sName != null){
			surName = sName;
		surNameValid =  true;	
		}else System.out.println("surName is not vlaid");
		if (dob != null){
			dateOfBirth = dob;
			dateOfBirthValid =  true;	
		}else System.out.println("provide valid dateOfBirth");
		if(gen != null){
			gender = gen;
			genderValid = true;
		}else System.out.println("p vlaid gender");
		if (mobile != 0){
			contact = mobile;
			contactValid =  true;	
		}else System.out.println("mobil number is not valid");
		if(mail != null){
			email = mail;
			emailValid = true;
		}else System.out.println("mail not valid");
		if(pword != null){
			password = pword;
			passwordValid = true;
		}else System.out.println("enter valid password");
		if(firstNameValid == true && surNameValid == true && dateOfBirthValid   == true && genderValid == true  && contactValid == true && emailValid == true && passwordValid == true){
			isAccountCreated = true;
		}
		return isAccountCreated;
	}
		public static void getUser(){
			System.out.println("the first Name :"+firstName);
			System.out.println("the sur name of user is  :"+surName);
			System.out.println("the dateOfBirth :"+dateOfBirth);
			System.out.println("the gender  :"+gender);
			System.out.println("the user phone number :"+contact);
			System.out.println("the user email id :"+email);
			System.out.println("the password :"+password);
			
	
	}
	
}