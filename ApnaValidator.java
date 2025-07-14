class ApnaValidator{
	
	static String fullName;
	static String companyName;
	static int employees;
	static String workEmail;
	
	public static boolean validationUser(String fName,String cName,int emp,String email){
		
	     boolean isValidated = false;
         boolean  fullNameValid       = false;  
		boolean   companyNameValid    = false;  
		boolean    employeesValid     = false;  
		boolean    workEmailValid     = false;  
		
		if(fName!= null){
			fullName = fName;
			fullNameValid = true;
		}else  System.out.println("name is not valid");
		
		if(cName != null){
			companyName = cName;
			companyNameValid = true;
		}else System.out.println("provide company Name");
		
		if(emp  !=0){
			employees = emp;
			employeesValid = true;
		}else System.out.println("number of employees are not valid");
		
		if(email != null){
			workEmail = email;
			workEmailValid = true;
		}else System.out.println("email ID is not valid");
		
		if(fullNameValid && companyNameValid && employeesValid && workEmailValid){
			System.out.println("given details(fullName,companyName,employees,workEmail) are valid");
			isValidated = true;
		}
		return isValidated;
		}
}