class Apna{
	
	static String fullName;
	static String companyName;
	static int employees;
	static String workEmail;
	
	public static boolean jobPosting(String fName,String cName,int emp,String email){
		
		boolean  isJobPosted   = false;  
		boolean  fullNameValid       = false;  
		boolean   companyNameValid      = false;  
		boolean    employeesValid     = false;  
		boolean    workEmailValid     = false;  
		
		if(fName!= null){
			fullName = fName;
			fullNameValid = true;
		}
		if(cName != null){
			companyName = cName;
			companyNameValid = true;
		}
		if(emp  !=0){
			employees = emp;
			employeesValid = true;
		}
		if(email != null){
			workEmail = email;
			workEmailValid = true;
		}
		if(fullNameValid == true && companyNameValid == true && employeesValid == true && workEmailValid == true){
			isJobPosted = true;
		}
		return isJobPosted;
	}
		public static void getCompanyInfo(){
			System.out.println("the full name  :"+fullName);
			System.out.println("the company Name is  :"+companyName);
			System.out.println("number of employees work in company  :"+employees);
			System.out.println("the Work Email :"+workEmail);
	}
	
}