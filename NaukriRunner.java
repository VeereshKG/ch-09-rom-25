class NaukriRunner{
	public static void main (String []movies){
		boolean isProfileCreated = Naukri.createYourNaukriProfile("bhuvan g","bhuvan@gmail.com","bhuvan#123",8754872457L,"fresher");
		System.out.println("is Naukri Profile Created :"+isProfileCreated);
		
		if(isProfileCreated) Naukri.getProfileDetails();
		
	}

}