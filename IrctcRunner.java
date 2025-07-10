class IrctcRunner{
	public static void main(String []booking){
		boolean isAccountCreated = Irctc.accountCreate("Raju","Raju R","Raju#123","Raju#123","raju@gmail.com",9876543565L) ;
					System.out.println("Is Account Created :"+isAccountCreated);
					
					Irctc.getUser();

	}
}