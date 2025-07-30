class CasinoRunner {

	public static void main(String[] casino) {

		Casino ref1 = new Casino(1);
		System.out.println("the casino id is " + ref1.casinoId);
		
		String names[] = {"Bellagio", "Star" ,"sydney"};
		
		Casino ref2 = new Casino(names,"Las Vegas");
		System.out.println("the location is " + ref2.location);
		ref2.getCasinoInfo();
		
		Casino ref3 = new Casino(true, 400.0);
		System.out.println("is open 24 hours " +ref3.isOpen24Hours);
		System.out.println("the entry fee is " +ref3. entryFee);


		
	}
}
