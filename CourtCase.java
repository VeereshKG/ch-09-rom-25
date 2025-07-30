class CourtCase{
	
	int caseId;
	String caseNames[];
	String lawerName;
	String caseOpenDate;
	boolean isCaseClosed;
	
	  CourtCase() {

    }

    CourtCase(int caseId, String caseNames[]){
		this.caseId = caseId;
        this.caseNames = caseNames;
	}
	 CourtCase(String lawerName, String caseOpenDate){
		 this.lawerName = lawerName;
        this.caseOpenDate = caseOpenDate;
	 } 
	 CourtCase(boolean isCaseClosed) {
        this.isCaseClosed = isCaseClosed;
    }
	
	
	
	public void getCourtCase(){
	
		System.out.println("the case names are");			
			for(String  caseName: caseNames)
				System.out.println(caseName);
}
}