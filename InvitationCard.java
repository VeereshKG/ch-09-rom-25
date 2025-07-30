class InvitationCard{
	
	int cardId;
	String occasions[];
	String sender;
	String receiver;
	String date;
	String venue;
	
	 InvitationCard() {

    }

    InvitationCard(int cardId, String occasions[]){
		this.cardId = cardId;
        this.occasions = occasions;
	}
	InvitationCard(String sender, String receiver, String date){
		this.sender = sender;
        this.receiver = receiver;
        this.date = date;
	}
	InvitationCard(String venue) {
        this.venue = venue;
    }
	
	
	
	public void getInvitationCardInfo(){
		
		System.out.println("the occasions are ");			
			for(String  occasion: occasions)
				System.out.println(occasion);

}
}