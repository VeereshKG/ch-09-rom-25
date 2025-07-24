class BillRunner{
	
	public static void main(String []amount){
		
		System.out.println("Main started");
		
		Bill ref1 = new Bill();
		ref1.billId = 1;
		ref1.billAmountWithTax = 200.0;
		ref1.planType = "Monthly Plan";
		ref1.billIssueDate = "15/07/2025";
		ref1.paymentMethod = "netBanking";
		ref1.billDueDate = "15/08/2025";
		ref1.isTaxInclusive = true;
		ref1.isBillPaid = true;
		ref1.isBillOverDue = false;
		ref1.getBillInfo();
		
		
		Bill ref2 = new Bill();
		ref2.billId = 2;
		ref2.billAmountWithTax = 300;
		ref2.planType = "yearly Plan";
		ref2.billIssueDate = "25/07/2025";
		ref2.paymentMethod = "online";
		ref2.billDueDate = "25/07/2026";
		ref2.isTaxInclusive = true;
		ref2.isBillPaid = false;
		ref2.isBillOverDue = false;
		ref2.getBillInfo();
		
		Bill ref3 = new Bill();
		ref3.billId = 3;
		ref3.billAmountWithTax = 255.0;
		ref3.planType = "quarterly Plan";
		ref3.billIssueDate = "15/05/2025";
		ref3.paymentMethod = "paytm";
		ref3.billDueDate = "15/08/2025";
		ref3.isTaxInclusive = true;
		ref3.isBillPaid = true;
		ref3.isBillOverDue = false;
		ref3.getBillInfo();
		
		
		Bill ref4 = new Bill();
		ref4.billId = 4;
		ref4.billAmountWithTax = 155.5;
		ref4.planType = "half-yearly Plan";
		ref4.billIssueDate = "15/07/2025";
		ref4.paymentMethod = "upi";
		ref4.billDueDate = "15/01/2026";
		ref4.isTaxInclusive = true;
		ref4.isBillPaid = false;
		ref4.isBillOverDue = false;
		ref4.getBillInfo();
		
		Bill ref5 = new Bill();
		ref5.billId = 5;
		ref5.billAmountWithTax = 300.0;
		ref5.planType = "Monthly Plan";
		ref5.billIssueDate = "15/07/2024";
		ref5.paymentMethod = "cash";
		ref5.billDueDate = "15/08/2024";
		ref5.isTaxInclusive = true;
		ref5.isBillPaid = true;
		ref5.isBillOverDue = false;
		ref5.getBillInfo();
		
		Bill ref6 = new Bill();
		ref6.billId = 6;
		ref6.billAmountWithTax = 500.5;
		ref6.planType = "yearly Plan";
		ref6.billIssueDate = "15/07/2025";
		ref6.paymentMethod = "upi";
		ref6.billDueDate = "15/07/2026";
		ref6.isTaxInclusive = true;
		ref6.isBillPaid = true;
		ref6.isBillOverDue = false;
		ref6.getBillInfo();
		
		
		Bill ref7 = new Bill();
		ref7.billId = 7;
		ref7.billAmountWithTax = 450.6;
		ref7.planType = "half-yearly Plan";
		ref7.billIssueDate = "25/01/2025";
		ref7.paymentMethod = "netBanking";
		ref7.billDueDate = "25/06/2025";
		ref7.isTaxInclusive = true;
		ref7.isBillPaid = false;
		ref7.isBillOverDue = true;
		ref7.getBillInfo();
		

		
		Bill ref8 = new Bill();
		ref8.billId = 8;
		ref8.billAmountWithTax = 655.2;
		ref8.planType = "quarterly Plan";
		ref8.billIssueDate = "02/08/2025";
		ref8.paymentMethod = "netBanking";
		ref8.billDueDate = "02/11/2025";
		ref8.isTaxInclusive = true;
		ref8.isBillPaid = true;
		ref8.isBillOverDue = false;
		ref8.getBillInfo();

		
		Bill ref9 = new Bill();
		ref9.billId = 9;
		ref9.billAmountWithTax = 555.6;
		ref9.planType = "yearly Plan";
		ref9.billIssueDate = "25/07/2025";
		ref9.paymentMethod = "online";
		ref9.billDueDate = "25/07/2026";
		ref9.isTaxInclusive = true;
		ref9.isBillPaid = false;
		ref9.isBillOverDue = false;
		ref9.getBillInfo();
		
		Bill ref10 = new Bill();
		ref10.billId = 10;
		ref10.billAmountWithTax = 600.5;
		ref10.planType = "monthly Plan";
		ref10.billIssueDate = "15/05/2025";
		ref10.paymentMethod = "paytm";
		ref10.billDueDate = "15/06/2025";
		ref10.isTaxInclusive = true;
		ref10.isBillPaid = true;
		ref10.isBillOverDue = false;
		ref10.getBillInfo();
		
		
		Bill ref11 = new Bill();
		ref11.billId = 11;
		ref11.billAmountWithTax = 100.0;
		ref11.planType = "half-yearly Plan";
		ref11.billIssueDate = "15/07/2025";
		ref11.paymentMethod = "upi";
		ref11.billDueDate = "15/01/2026";
		ref11.isTaxInclusive = true;
		ref11.isBillPaid = false;
		ref11.isBillOverDue = true;
		ref11.getBillInfo();
		

		
		Bill ref12 = new Bill();
		ref12.billId = 12;
		ref12.billAmountWithTax = 200.0;
		ref12.planType = "quarterly Plan";
		ref12.billIssueDate = "15/07/2024";
		ref12.paymentMethod = "netBanking";
		ref12.billDueDate = "15/10/2025";
		ref12.isTaxInclusive = true;
		ref12.isBillPaid = false;
		ref12.isBillOverDue = true;
		ref12.getBillInfo();
		

		
		Bill ref13 = new Bill();
		ref13.billId = 13;
		ref13.billAmountWithTax = 150.0;
		ref13.planType = "yearly Plan";
		ref13.billIssueDate = "15/07/2025";
		ref13.paymentMethod = "online";
		ref13.billDueDate = "15/07/2026";
		ref13.isTaxInclusive = false;
		ref13.isBillPaid = true;
		ref13.isBillOverDue = false;
		ref13.getBillInfo();

		
		Bill ref14 = new Bill();
		ref14.billId = 14;
		ref14.billAmountWithTax = 450.6;
		ref14.planType = "half-yearly Plan";
		ref14.billIssueDate = "25/01/2025";
		ref14.paymentMethod = "netBanking";
		ref14.billDueDate = "25/06/2025";
		ref14.isTaxInclusive = true;
		ref14.isBillPaid = false;
		ref14.isBillOverDue = true;
		ref14.getBillInfo();

		
		Bill ref15 = new Bill();
		ref15.billId = 15;
		ref15.billAmountWithTax = 625.5;
		ref15.planType = "quarterly Plan";
		ref15.billIssueDate = "15/07/2025";
		ref15.paymentMethod = "cash";
		ref15.billDueDate = "15/10/2025";
		ref15.isTaxInclusive = true;
		ref15.isBillPaid = false;
		ref15.isBillOverDue = true;
		ref15.getBillInfo();

		
		Bill ref16 = new Bill();
		ref16.billId = 16;
		ref16.billAmountWithTax = 250.5;
		ref16.planType = "yearly Plan";
		ref16.billIssueDate = "25/07/2025";
		ref16.paymentMethod = "cash";
		ref16.billDueDate = "25/07/2026";
		ref16.isTaxInclusive = true;
		ref16.isBillPaid = false;
		ref16.isBillOverDue = true;
		ref16.getBillInfo();
	
		Bill ref17 = new Bill();
		ref17.billId = 17;
		ref17.billAmountWithTax = 255.0;
		ref17.planType = "half-yearly Plan";
		ref17.billIssueDate = "15/05/2025";
		ref17.paymentMethod = "online";
		ref17.billDueDate = "15/11/2025";
		ref17.isTaxInclusive = true;
		ref17.isBillPaid = true;
		ref17.isBillOverDue = true;
		ref17.getBillInfo();
		
		Bill ref18 = new Bill();
		ref18.billId = 18;
		ref18.billAmountWithTax = 215.6;
		ref18.planType = "monthly Plan";
		ref18.billIssueDate = "05/07/2025";
		ref18.paymentMethod = "online";
		ref18.billDueDate = "05/08/2026";
		ref18.isTaxInclusive = true;
		ref18.isBillPaid = true;
		ref18.isBillOverDue = false;
		ref18.getBillInfo();
		
		Bill ref19 = new Bill();
		ref19.billId = 19;
		ref19.billAmountWithTax = 300.0;
		ref19.planType = "Monthly Plan";
		ref19.billIssueDate = "28/07/2024";
		ref19.paymentMethod = "cash";
		ref19.billDueDate = "28/08/2054";
		ref19.isTaxInclusive = true;
		ref19.isBillPaid = false;
		ref19.isBillOverDue = true;
		ref19.getBillInfo();

		
		Bill ref20 = new Bill();
		ref20.billId = 20;
		ref20.billAmountWithTax = 250.0;
		ref20.planType = "half-yearly Plan";
		ref20.billIssueDate = "24/05/2025";
		ref20.paymentMethod = "cash";
		ref20.billDueDate = "24/11/2025";
		ref20.isTaxInclusive = true;
		ref20.isBillPaid = true;
		ref20.isBillOverDue = false;
		ref20.getBillInfo();

		
		
		System.out.println("Main ended");
		
		
	}
}