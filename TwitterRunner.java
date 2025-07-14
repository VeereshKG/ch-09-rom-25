class TwitterRunner{
	public static void main (String []movies){
		boolean isAccountCreated = Twitter.createAccount("pramod","pramod@gmail.com","12/05/2003");
		System.out.println("is twitter Account Created :"+isAccountCreated);
		
		if(isAccountCreated) Twitter.getAccountDetails();
		
	}

}