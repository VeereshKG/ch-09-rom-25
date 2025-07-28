class InvitationCard{
	
	 InvitationCard() {
        System.out.println("the constructor is invoked");
    }

    InvitationCard(int cardId, String occasion, String sender, String receiver, String date, String venue) {
        System.out.println("the parameterized constructor is invoked");

        this.cardId = cardId;
        this.occasion = occasion;
        this.sender = sender;
        this.receiver = receiver;
        this.date = date;
        this.venue = venue;
    }
	
	int cardId;
	String occasion;
	String sender;
	String receiver;
	String date;
	String venue;
	
	public void getInvitationCardInfo(){
		System.out.println("the card id is " + cardId);
		System.out.println("the occasion is " + occasion);
		System.out.println("the sender is " + sender);
		System.out.println("the receiver is " + receiver);
		System.out.println("the date is " + date);
		System.out.println("the venue is " + venue);
		System.out.println("");
		
}
}