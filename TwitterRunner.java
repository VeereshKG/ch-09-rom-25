class TwitterRunner{
	
	public static void main(String []twit){
		
		String	email = "bhuvan.com";
	String	password = "bhuvan@123";
	long phoneNumber = 7624587965L;
	
		Twitter.logIn(email , password);
		
		Twitter.logIn(phoneNumber , password);
		
	}
}