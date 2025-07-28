class King{
	
	 King() {
        System.out.println("the King constructor is invoked");
    }

    King(int kingId, String name, String kingdom, int reignYears, String dynasty, boolean isWarrior) {
        System.out.println("the parameterized  King constructor is invoked");

        this.kingId = kingId;
        this.name = name;
        this.kingdom = kingdom;
        this.reignYears = reignYears;
        this.dynasty = dynasty;
        this.isWarrior = isWarrior;
    }
	
	int kingId;
	String name;
	String kingdom;
	int reignYears;
	String dynasty;
	boolean isWarrior;
	
	public void getKingInfo(){
		
		System.out.println("the king id is " + kingId);
		System.out.println("the king name is " + name);
		System.out.println("the kingdom is " + kingdom);
		System.out.println("the reign years are " + reignYears);
		System.out.println("the dynasty is " + dynasty);
		System.out.println("is he a warrior " + isWarrior);
		System.out.println("");
		
	}
}