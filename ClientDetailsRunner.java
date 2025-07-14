class ClientDetailsRunner{
	
	public static void main(String[]info){
	String firstName	= ClientDetails.fName();
	System.out.println("The first name :"+firstName);
	
	String lastName = ClientDetails.lName();
	System.out.println("Last Name is :"+lastName);
	
	int age = ClientDetails.cage();
	System.out.println("the Age :"+age);
	
	char gender = ClientDetails.cgender();
	System.out.println("The gender of "+firstName+" is :"+gender);
	
	double netWorth = ClientDetails.worth();
	System.out.println("The Net Worth of "+firstName+" is :"+netWorth);
	
	float height = ClientDetails.cheight();
	System.out.println("The Height of "+firstName+" is :"+height);
	
	byte salary = ClientDetails.amount();
	System.out.println("Salary is :"+salary +"Lpa");
	
	short yearOfBirth = ClientDetails.yob();
	System.out.println("The Year of birth :"+yearOfBirth);
	
	long mobileNumber = ClientDetails.mobNumber();
	System.out.println("The contact number of "+firstName+" is :"+mobileNumber);
	
	boolean married = ClientDetails.married();
	System.out.println("is "+firstName+" Married :"+married);
	

	}
	
	
}
