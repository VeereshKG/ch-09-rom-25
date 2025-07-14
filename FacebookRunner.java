class FacebookRunner{
	
	public static void main(String []face){
		boolean isAccountCreated = Facebook.accountCreate("shiv","gowda","12/04/2003","male",7665654765L,"shiv@gmail.com","shivgowda23") ;
					System.out.println("Is Account Created :"+isAccountCreated);
					
			if(isAccountCreated)		Facebook.getUser();
	}
}