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
	    boolean titleValid = false;
		boolean firstNameValid = false;
		boolean lastNameValid = false;
		boolean nationalityValid = false;
		boolean dateOfBirthValid = false;
		boolean mobilNumberValid = false;
		boolean emailValid = false;
		
		if(tit != null){
			title = tit;
			titleValid = true;
		}
		if(fName != null){
			firstName = fName;
			firstNameValid = true;
		}
		if (lName != null){
			lastName = lName;
		lastNameValid =  true;	
		}
		if(nation != null){
			nationality = nation;
			nationalityValid = true;
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

		if(titleValid == true && firstNameValid == true && lastNameValid == true && nationalityValid == true && dateOfBirthValid   == true &&  mobilNumberValid == true && emailValid == true){
			isAccountCreated = true;
		}
		return isAccountCreated;
	}
		public static void getUser(){
			System.out.println("the title :"+title);
			System.out.println("the first Name of user is :"+firstName);
			System.out.println("the last name of user is  :"+lastName);
			System.out.println("the nationality   :"+nationality);
			System.out.println("the dateOfBirth :"+dateOfBirth);
			System.out.println("the user phone number :"+mobilNumber);
			System.out.println("the user email id :"+email);
			
	
	}
}