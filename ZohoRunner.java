class ZohoRunner{
	
	public static void main(String []zoho){
		
		String email = "ravi@gmail.com";
		String password = "ravi345";
		long phoneNumber = 6547896324L;
		
		Zoho.signIn(email , password);
		
		Zoho.signIn(phoneNumber , password);
	}

}