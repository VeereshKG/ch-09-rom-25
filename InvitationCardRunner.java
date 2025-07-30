class InvitationCardRunner {

	public static void main(String[] card) {
		
        String occasions[] = { "Wedding","nameing cermony"};
		InvitationCard ref1 = new InvitationCard(1,occasions);
		System.out.println("the card id is " + ref1.cardId);
        ref1.getInvitationCardInfo(); 
		 
		InvitationCard ref2 = new InvitationCard("Ravi", "Arjun", "10-Aug-2025");
		System.out.println("the sender is " + ref2.sender);
		System.out.println("the receiver is " + ref2.receiver);
		System.out.println("the date is " + ref2.date);
		
		InvitationCard ref3 = new InvitationCard(" Mysore");
		System.out.println("the venue is " +ref3.venue);
	
	}
}
