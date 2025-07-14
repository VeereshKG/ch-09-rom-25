class ApnaRunner{

	public static void main(String []job){
		boolean isJobPosted = Apna.jobPosting("Omkar","X-wokz",15,"xWorkz.in") ;
					System.out.println("Is Job Posted :"+isJobPosted);
					
				if(isJobPosted)	Apna.getCompanyInfo();
	}
}