class CourtCase{
	
	  CourtCase() {
        System.out.println("The constructor is invoked");
    }

    CourtCase(int caseId, String caseName, String lawerName, String caseOpenDate, boolean isCaseClosed) {
        System.out.println("The parameterized constructor is invoked");
        this.caseId = caseId;
        this.caseName = caseName;
        this.lawerName = lawerName;
        this.caseOpenDate = caseOpenDate;
        this.isCaseClosed = isCaseClosed;
    }
	
	int caseId;
	String caseName;
	String lawerName;
	String caseOpenDate;
	boolean isCaseClosed;
	
	public void getCourtCase(){
	
		System.out.println("the case id is "+caseId);
		System.out.println("the case name is "+caseName);
		System.out.println("the lawerName is "+lawerName);
		System.out.println("the case open Date "+caseOpenDate);
		System.out.println("is case closed "+isCaseClosed);
        System.out.println(" " );
}
}