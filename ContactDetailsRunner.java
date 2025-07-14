class ContactDetailsRunner{
	
	public static void main(String []number){
		String name = "Ramesh";
	long contact = ContactDetails.getPhoneNumber(name);
	if(contact > 0)
	System.out.println("the phone Number of "+name+" is :"+contact);
}
	}