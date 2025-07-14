class PanCardValidator{
	
		static   String   applicationType;
    static   String   title;
    static   String   firstName;
	static   String  middleName;
    static   String   lastName;
    static   String   dateOfBirth;
    static   long   mobilNumber;
    static   String   email;
	
	public static boolean validationUser(String type,String tit,String fName,String mName,String lName,String dob,long mobile,String mail){
		
		boolean isValidationDone = false;
		boolean applicationTypeValid = false;
	    boolean titleValid = false;
		boolean firstNameValid = false;
		boolean middleNameValid = false;
		boolean lastNameValid = false;
		boolean dateOfBirthValid = false;
		boolean mobilNumberValid = false;
		boolean emailValid = false;
		
		if(type != null){
			applicationType = type;
			applicationTypeValid = true;
		}else System.out.println("enter type correctly");
		
		if(tit != null){
			title = tit;
			titleValid = true;
		}else System.out.println("provide valid title ");
		
		if(fName != null){
			firstName = fName;
			firstNameValid = true;
		}else System.out.println("firstName is not valid");
		
		if (mName != null){
			middleName = mName;
		middleNameValid =  true;	
		}else System.out.println("middleName is not valid");
		
		if (lName != null){
			lastName = lName;
		lastNameValid =  true;	
		}else System.out.println("lastName is not valid");
		
		if (dob != null){
			dateOfBirth = dob;
			dateOfBirthValid =  true;	
		}else System.out.println("enter valid dateOfBirth");

		if (mobile != 0){
			mobilNumber = mobile;
			mobilNumberValid =  true;	
		}else System.out.println("mobilNumber is not valid");
		
		if(mail != null){
			email = mail;
			emailValid = true;
		}else System.out.println("enterd mail is incorrect`");

		if(applicationTypeValid == true && titleValid == true && firstNameValid == true && middleNameValid == true && lastNameValid == true && dateOfBirthValid   == true &&  mobilNumberValid == true && emailValid == true){
			isValidationDone = true;
		}
		return isValidationDone;
	}


}