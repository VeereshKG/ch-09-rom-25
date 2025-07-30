class KingRunner {

	public static void main(String[] king) {

		King ref1 = new King(1, "Ashoka", "Maurya");
			System.out.println("the king id is " + ref1.kingId);
		System.out.println("the king name is " + ref1.name);
		System.out.println("the kingdom is " + ref1.kingdom);
		
		King ref2 = new King(36, "Mauryan");
		System.out.println("the reign years are " + ref2.reignYears);
		System.out.println("the dynasty is " + ref2.dynasty);
		
		King ref3 = new King(true);
		System.out.println("is he a warrior " + ref3.isWarrior);
	
	}
}
