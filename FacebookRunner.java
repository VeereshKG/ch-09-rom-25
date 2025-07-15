class FacebookRunner{
	
	public static void main (String []face){
		
	String	email = "kgveersh@gmail.com";
	String	password = "Veeresh@123";
	long phoneNumber = 875478965L;
	
		Facebook.login(email , password);
		
		Facebook.login(phoneNumber , password);
		
		
		
	}
}