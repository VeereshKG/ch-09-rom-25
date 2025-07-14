class PanCard{
	static   String   applicationType;
    static   String   title;
    static   String   firstName;
	static   String  middleName;
    static   String   lastName;
    static   String   dateOfBirth;
    static   long   mobilNumber;
    static   String   email;

     public static boolean applicationSubmission(String type,String tit,String fName,String mName,String lName,String dob,long mobile,String mail){
		
		boolean isApplicationSubmitted = false;
		
		boolean isValidationDone = PanCardValidator.validationUser(type,tit,fName,mName,lName,dob,mobile,mail);
		
		if(isValidationDone == true){
			isApplicationSubmitted = true;
		}else System.out.println("application is not submitted");
		// boolean applicationTypeValid = false;
	    // boolean titleValid = false;
		// boolean firstNameValid = false;
		// boolean middleNameValid = false;
		// boolean lastNameValid = false;
		// boolean dateOfBirthValid = false;
		// boolean mobilNumberValid = false;
		// boolean emailValid = false;
		
		// if(type != null){
			// applicationType = type;
			// applicationTypeValid = true;
		// }else System.out.println("enter type correctly");
		
		// if(tit != null){
			// title = tit;
			// titleValid = true;
		// }else System.out.println("provide valid title ");
		
		// if(fName != null){
			// firstName = fName;
			// firstNameValid = true;
		// }else System.out.println("firstName is not valid");
		
		// if (mName != null){
			// middleName = mName;
		// middleNameValid =  true;	
		// }else System.out.println("middleName is not valid");
		
		// if (lName != null){
			// lastName = lName;
		// lastNameValid =  true;	
		// }else System.out.println("lastName is not valid");
		
		// if (dob != null){
			// dateOfBirth = dob;
			// dateOfBirthValid =  true;	
		// }else System.out.println("enter valid dateOfBirth");

		// if (mobile != 0){
			// mobilNumber = mobile;
			// mobilNumberValid =  true;	
		// }else System.out.println("mobilNumber is not valid");
		
		// if(mail != null){
			// email = mail;
			// emailValid = true;
		// }else System.out.println("enterd mail is incorrect`");

		// if(applicationTypeValid == true && titleValid == true && firstNameValid == true && middleNameValid == true && lastNameValid == true && dateOfBirthValid   == true &&  mobilNumberValid == true && emailValid == true){
			// isApplicationSubmitted = true;
		// }
		return isApplicationSubmitted;
	}
		public static void getDetails(){
			
			applicationType = PanCardValidator.applicationType;
			title = PanCardValidator.title;
			firstName = PanCardValidator.firstName;
			middleName = PanCardValidator.middleName;
			lastName = PanCardValidator.lastName;
			dateOfBirth = PanCardValidator.dateOfBirth;
			mobilNumber = PanCardValidator.mobilNumber;
			email = PanCardValidator.email;
			
			System.out.println("the application Type:"+applicationType);
			System.out.println("the title :"+title);
			System.out.println("the first Name of Applicant is :"+firstName);
			System.out.println("the middle Name of Applicantr is :"+middleName);
			System.out.println("the last name of Applicant is  :"+lastName);
			System.out.println("the dateOfBirth :"+dateOfBirth);
			System.out.println("the Applicant phone number :"+mobilNumber);
			System.out.println(" Applicant email id :"+email);
			
	
	}
}