class InstagrmRunner{
	
	public static void main (String []insta){
		
		String emailOrUserName = "raju@gmail.com";
		String password = "raju#123";
		long phoneNumber  = 8745213665L;
		
		Instagram.getLogIn(emailOrUserName, password);
		
		Instagram.getLogIn(phoneNumber , password);
		
	}

}