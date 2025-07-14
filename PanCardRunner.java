class PanCardRunner{
	public static void main(String []application){
		boolean  isApplicationSubmitted = PanCard.applicationSubmission("New PAN","miss.","Jayanthi","despande","N","15/07/1998",9547862548L,"jayanthi@gamil.com") ;
					System.out.println("Is Application Submitted :"+isApplicationSubmitted);
					
				if(isApplicationSubmitted)	PanCard.getDetails();
	}
}