package com.xworkz.courtapp.courtcase;

public class CourtCase {

  private   int caseId;
    private  String caseName;
    private  String lawerName;
    private String caseOpenDate;
    private  boolean isCaseClosed;

   public int getCaseId(){
        return caseId;
    }
    public void setCaseId(int caseId){
       this.caseId = caseId;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }
   public String getLawerName(){
       return lawerName;
    }

    public void setLawerName(String lawerName) {
        this.lawerName = lawerName;
    }

    public String getCaseOpenDate() {
        return caseOpenDate;
    }

    public void setCaseOpenDate(String caseOpenDate) {
        this.caseOpenDate = caseOpenDate;
    }
   public boolean getIsCaseClosed(){
       return isCaseClosed;
    }
    public void setIsCaseClosed(boolean isCaseClosed){
       this.isCaseClosed = isCaseClosed;
    }
}
