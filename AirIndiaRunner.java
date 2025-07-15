class AirIndiaRunner{
	
	public static void main (String []india){
		
		long  phoneNumber = 9654785486L;
		int otp = 4578;
		String email = "kiran@gmail.com";
		
		AirIndia.signIn(phoneNumber , otp);
		
		AirIndia.signIn(email , otp);
	}
}