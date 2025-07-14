class SpotifyRunner{
	public static void main (String []music){
		boolean isSignUpDone = Spotify.signUp("kgveeresh6@gamil.com","Veeresh@123","VEERESH","15/01/2002",'M');
		System.out.println("Sign Up to Start listening music :"+isSignUpDone);
		
		if(isSignUpDone) Spotify.getSignUpDetails();
		
	}
}