class AirIndiaRunner{
	public static void main(String []flit){
		boolean isAccountCreated = AirIndia.accountCreate("mr.","bhuvan","gowda","Indian","23/04/2001",7654321875L,"bhuvan@gamil.com") ;
					System.out.println("Is Account Created :"+isAccountCreated);
					
				if(isAccountCreated)	AirIndia.getUser();
	}
}