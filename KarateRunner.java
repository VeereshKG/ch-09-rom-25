class KarateRunner {
	public static void main(String[] karate) {
		
		String styles[] = {"Shotokan","Shito-ryu"};
		Karate ref1 = new Karate(1, styles);
		System.out.println("the karate id is " + ref1.karateId);
		ref1.getKarateInfo();
		
		Karate ref2 = new Karate("Gichin Funakoshi", "Japan");
		System.out.println("the master is " + ref2.master);
		System.out.println("the origin country is " + ref2.originCountry);
		
		Karate ref3 = new Karate(true);
		System.out.println("is olympic sport " + ref3.isOlympicSport);
		
	}
}

