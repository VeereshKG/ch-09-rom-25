class CountryRunner{
	
	public static void main(String []code){
	String	countryN = "Finland";
	int cCode	= Country.getCountryCode(countryN);
	if(cCode >0)
		System.out.println("the country code of "+countryN+" is "+cCode);

	 

	}
}