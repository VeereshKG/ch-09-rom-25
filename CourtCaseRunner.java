class CourtCaseRunner {
	
	public static void main(String[] court) {
		
		String caseNames[] = {"accident", "land dispute" };
		CourtCase ref1 = new CourtCase(1,caseNames); 
		System.out.println("the case id is "+ref1.caseId);
		ref1.getCourtCase();
		
		CourtCase ref2 = new CourtCase("raju", "12/05/2000");
		System.out.println("the lawerName is "+ref2.lawerName);
		System.out.println("the case open Date "+ref2.caseOpenDate);
		
		CourtCase ref3 = new CourtCase(false);
		System.out.println("is case closed "+ref3.isCaseClosed);
	
	}
}
