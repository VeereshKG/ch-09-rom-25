class AirIndia{
	
static   String   title;
static   String   firstName;
static   String   lastName;
static   String   nationality;
static   String   dateOfBirth;
static   long   mobilNumber;
static   String   email;

     public static boolean accountCreate(String tit,String fName,String lName,String nation,String dob,long mobile,String mail){
		
		boolean isAccountCreated = false;
		
	boolean isValidation = AirIndiaValidator.validateUser(tit,fName,lName,nation,dob,mobile,mail);
	
	if(isValidation == true ){
		isAccountCreated = true;
	}else System.out.println("thr account not Created ");
	
	    // boolean titleValid = false;
		// boolean firstNameValid = false;
		// boolean lastNameValid = false;
		// boolean nationalityValid = false;
		// boolean dateOfBirthValid = false;
		// boolean mobilNumberValid = false;
		// boolean emailValid = false;
		
		// if(tit != null){
			// title = tit;
			// titleValid = true;
		// }else System.out.println("provide correct title");
		
		// if(fName != null){
			// firstName = fName;
			// firstNameValid = true;
		// }else System.out.println("povide full name");
		
		// if (lName != null){
			// lastName = lName;
		// lastNameValid =  true;	
		// }else System.out.println("provide last name");
		
		// if(nation != null){
			// nationality = nation;
			// nationalityValid = true;
		// }else System.out.println("please provide correct ");
		
		// if (dob != null){
			// dateOfBirth = dob;
			// dateOfBirthValid =  true;	
		// }else System.out.println("date of birth is not valid");

		// if (mobile != 0){
			// mobilNumber = mobile;
			// mobilNumberValid =  true;	
		// }else System.out.println("provide valid mobilNumber");
		
		// if(mail != null){
			// email = mail;
			// emailValid = true;
		// }else System.out.println("provide correct mailId");

		// if(titleValid == true && firstNameValid == true && lastNameValid == true && nationalityValid == true && dateOfBirthValid   == true &&  mobilNumberValid == true && emailValid == true){
			// System.out.println("the given details(title	,firstName,lastName,nationality,dateOfBirth,mobilNumber,emailValid) are valid");
			// isAccountCreated = true;
		return isAccountCreated;
		}
		    


	 
		public static void getUser(){
			
			title = AirIndiaValidator.title;
			firstName = AirIndiaValidator.firstName;
			nationality = AirIndiaValidator.nationality;
			dateOfBirth = AirIndiaValidator.dateOfBirth;
			mobilNumber = AirIndiaValidator.mobilNumber;
			email = AirIndiaValidator.email;
			
			System.out.println("the title :"+title);
			System.out.println("the first Name of user is :"+firstName);
			System.out.println("the last name of user is  :"+lastName);
			System.out.println("the nationality   :"+nationality);
			System.out.println("the dateOfBirth :"+dateOfBirth);
			System.out.println("the user phone number :"+mobilNumber);
			System.out.println("the user email id :"+email);
			
		}
	}
