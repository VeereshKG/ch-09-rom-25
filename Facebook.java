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
		}
		if (sName != null){
			surName = sName;
		surNameValid =  true;	
		}
		if (dob != null){
			dateOfBirth = dob;
			dateOfBirthValid =  true;	
		}
		if(gen != null){
			gender = gen;
			genderValid = true;
		}
		if (mobile != 0){
			contact = mobile;
			contactValid =  true;	
		}
		if(mail != null){
			email = mail;
			emailValid = true;
		}
		if(pword != null){
			password = pword;
			passwordValid = true;
		}
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