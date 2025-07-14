class PrimeRunner{
	public static void main (String []movies){
		boolean isAccountCreated = Prime.createAccount("teja",8754578647L,"teja#123");
		System.out.println("is Prime Account Created :"+isAccountCreated);
		
		if(isAccountCreated) Prime.getAccountDetails();
		
	}

}