class Bill{
	
	//properties,ref,variables
	int billId;
	double billAmountWithTax;
	String planType;
	String billIssueDate;
	String paymentMethod;
	String billDueDate;
	boolean isTaxInclusive;
	boolean isBillPaid;
	boolean isBillOverDue;
	
	public void getBillInfo(){
		
		System.out.println("the bill Id is "+billId);
		System.out.println("the firstbill amount  is "+billAmountWithTax);
		System.out.println("the planType  is "+planType);
		System.out.println("the billIssueDate is "+billIssueDate);
		System.out.println("the paymentMethod is "+paymentMethod);
		System.out.println("the billDueDate is "+billDueDate);
		System.out.println("isTaxInclusive in the bill "+isTaxInclusive);
		System.out.println("isBillPaid "+isBillPaid);
		System.out.println("isBillOverDue "+isBillOverDue);
		System.out.println("");
	}
	
		
	}
