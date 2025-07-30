class CoinsRunner {

	public static void main(String[] coin) {

		Coins ref1 = new Coins(1);
	    System.out.println("the coin id is " + ref1.coinId);
		
		String countrys[] = {"India", "Africa"};
		Coins ref2 = new Coins(countrys,"Steel" );
		System.out.println("the material is " + ref2.material);
		ref2.getCoinsInfo();
		
		
		
		Coins ref3 = new Coins(2000, 1.0);
		System.out.println("the year is " + ref3.year);
		System.out.println("the value is " +ref3. value);
		
		Coins ref4 = new Coins("Round");
		System.out.println("the shape is " + ref4.shape);




	}
}
