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
		}
		if(tit != null){
			title = tit;
			titleValid = true;
		}
		if(fName != null){
			firstName = fName;
			firstNameValid = true;
		}
		if (mName != null){
			middleName = mName;
		middleNameValid =  true;	
		}
		if (lName != null){
			lastName = lName;
		lastNameValid =  true;	
		}
		if (dob != null){
			dateOfBirth = dob;
			dateOfBirthValid =  true;	
		}

		if (mobile != 0){
			mobilNumber = mobile;
			mobilNumberValid =  true;	
		}
		if(mail != null){
			email = mail;
			emailValid = true;
		}

		if(applicationTypeValid == true && titleValid == true && firstNameValid == true && middleNameValid == true && lastNameValid == true && dateOfBirthValid   == true &&  mobilNumberValid == true && emailValid == true){
			isApplicationSubmitted = true;
		}
		return isApplicationSubmitted;
	}
		public static void getDetails(){
			System.out.println("the application Type:"+applicationType);
			System.out.println("the title :"+title);
			System.out.println("the first Name of Applicant is :"+firstName);
			System.out.println("the middle Name of Applicantr is :"+firstName);
			System.out.println("the last name of Applicant is  :"+lastName);
			System.out.println("the dateOfBirth :"+dateOfBirth);
			System.out.println("the Applicant phone number :"+mobilNumber);
			System.out.println(" Applicant email id :"+email);
			
	
	}
}