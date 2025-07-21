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
		
		System.out.println("the bill Id is "+ref1.billId);
		System.out.println("the firstbill amount  is "+ref1.billAmountWithTax);
		System.out.println("the planType  is "+ref1.planType);
		System.out.println("the billIssueDate is "+ref1.billIssueDate);
		System.out.println("the paymentMethod is "+ref1.paymentMethod);
		System.out.println("the billDueDate is "+ref1.billDueDate);
		System.out.println("isTaxInclusive in the bill "+ref1.isTaxInclusive);
		System.out.println("isBillPaid "+ref1.isBillPaid);
		System.out.println("isBillOverDue "+ref1.isBillOverDue);
		
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
		
		System.out.println("the bill Id is "+ref2.billId);
		System.out.println("the  bill amount  is "+ref2.billAmountWithTax);
		System.out.println("the planType  is "+ref2.planType);
		System.out.println("the billIssueDate is "+ref2.billIssueDate);
		System.out.println("the paymentMethod is "+ref2.paymentMethod);
		System.out.println("the billDueDate is "+ref2.billDueDate);
		System.out.println("isTaxInclusive in the bill "+ref2.isTaxInclusive);
		System.out.println("isBillPaid "+ref2.isBillPaid);
		System.out.println("isBillOverDue "+ref2.isBillOverDue);
		
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
		
		System.out.println("the bill Id is "+ref3.billId);
		System.out.println("the bill amount  is "+ref3.billAmountWithTax);
		System.out.println("the planType  is "+ref3.planType);
		System.out.println("the billIssueDate is "+ref3.billIssueDate);
		System.out.println("the paymentMethod is "+ref3.paymentMethod);
		System.out.println("the billDueDate is "+ref3.billDueDate);
		System.out.println("isTaxInclusive in the bill "+ref3.isTaxInclusive);
		System.out.println("isBillPaid "+ref3.isBillPaid);
		System.out.println("isBillOverDue "+ref3.isBillOverDue);
		
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
		
		System.out.println("the bill Id is "+ref4.billId);
		System.out.println("the bill amount  is "+ref4.billAmountWithTax);
		System.out.println("the planType  is "+ref4.planType);
		System.out.println("the billIssueDate is "+ref4.billIssueDate);
		System.out.println("the paymentMethod is "+ref4.paymentMethod);
		System.out.println("the billDueDate is "+ref4.billDueDate);
		System.out.println("isTaxInclusive in the bill "+ref4.isTaxInclusive);
		System.out.println("isBillPaid "+ref4.isBillPaid);
		System.out.println("isBillOverDue "+ref4.isBillOverDue);
		
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
		
		System.out.println("the bill Id is "+ref5.billId);
		System.out.println("the bill amount  is "+ref5.billAmountWithTax);
		System.out.println("the planType  is "+ref5.planType);
		System.out.println("the billIssueDate is "+ref5.billIssueDate);
		System.out.println("the paymentMethod is "+ref5.paymentMethod);
		System.out.println("the billDueDate is "+ref5.billDueDate);
		System.out.println("isTaxInclusive in the bill "+ref5.isTaxInclusive);
		System.out.println("isBillPaid "+ref5.isBillPaid);
		System.out.println("isBillOverDue "+ref5.isBillOverDue);
		
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
		
		System.out.println("the bill Id is "+ref6.billId);
		System.out.println("the bill amount  is "+ref6.billAmountWithTax);
		System.out.println("the planType  is "+ref6.planType);
		System.out.println("the billIssueDate is "+ref6.billIssueDate);
		System.out.println("the paymentMethod is "+ref6.paymentMethod);
		System.out.println("the billDueDate is "+ref6.billDueDate);
		System.out.println("isTaxInclusive in the bill "+ref6.isTaxInclusive);
		System.out.println("isBillPaid "+ref6.isBillPaid);
		System.out.println("isBillOverDue "+ref6.isBillOverDue);
		
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
		
		System.out.println("the bill Id is "+ref7.billId);
		System.out.println("the bill amount  is "+ref7.billAmountWithTax);
		System.out.println("the planType  is "+ref7.planType);
		System.out.println("the billIssueDate is "+ref7.billIssueDate);
		System.out.println("the paymentMethod is "+ref7.paymentMethod);
		System.out.println("the billDueDate is "+ref7.billDueDate);
		System.out.println("isTaxInclusive in the bill "+ref7.isTaxInclusive);
		System.out.println("isBillPaid "+ref7.isBillPaid);
		System.out.println("isBillOverDue "+ref7.isBillOverDue);
		
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
		
		System.out.println("the bill Id is "+ref8.billId);
		System.out.println("the firstbill amount  is "+ref8.billAmountWithTax);
		System.out.println("the planType  is "+ref8.planType);
		System.out.println("the billIssueDate is "+ref8.billIssueDate);
		System.out.println("the paymentMethod is "+ref8.paymentMethod);
		System.out.println("the billDueDate is "+ref8.billDueDate);
		System.out.println("isTaxInclusive in the bill "+ref8.isTaxInclusive);
		System.out.println("isBillPaid "+ref8.isBillPaid);
		System.out.println("isBillOverDue "+ref8.isBillOverDue);
		
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
		
		System.out.println("the bill Id is "+ref9.billId);
		System.out.println("the  bill amount  is "+ref9.billAmountWithTax);
		System.out.println("the planType  is "+ref9.planType);
		System.out.println("the billIssueDate is "+ref9.billIssueDate);
		System.out.println("the paymentMethod is "+ref9.paymentMethod);
		System.out.println("the billDueDate is "+ref9.billDueDate);
		System.out.println("isTaxInclusive in the bill "+ref9.isTaxInclusive);
		System.out.println("isBillPaid "+ref9.isBillPaid);
		System.out.println("isBillOverDue "+ref9.isBillOverDue);
		
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
		
		System.out.println("the bill Id is "+ref10.billId);
		System.out.println("the bill amount  is "+ref10.billAmountWithTax);
		System.out.println("the planType  is "+ref10.planType);
		System.out.println("the billIssueDate is "+ref10.billIssueDate);
		System.out.println("the paymentMethod is "+ref10.paymentMethod);
		System.out.println("the billDueDate is "+ref10.billDueDate);
		System.out.println("isTaxInclusive in the bill "+ref10.isTaxInclusive);
		System.out.println("isBillPaid "+ref10.isBillPaid);
		System.out.println("isBillOverDue "+ref10.isBillOverDue);
		
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
		
		System.out.println("the bill Id is "+ref11.billId);
		System.out.println("the bill amount  is "+ref11.billAmountWithTax);
		System.out.println("the planType  is "+ref11.planType);
		System.out.println("the billIssueDate is "+ref11.billIssueDate);
		System.out.println("the paymentMethod is "+ref11.paymentMethod);
		System.out.println("the billDueDate is "+ref4.billDueDate);
		System.out.println("isTaxInclusive in the bill "+ref11.isTaxInclusive);
		System.out.println("isBillPaid "+ref11.isBillPaid);
		System.out.println("isBillOverDue "+ref11.isBillOverDue);
		
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
		
		System.out.println("the bill Id is "+ref12.billId);
		System.out.println("the bill amount  is "+ref12.billAmountWithTax);
		System.out.println("the planType  is "+ref12.planType);
		System.out.println("the billIssueDate is "+ref12.billIssueDate);
		System.out.println("the paymentMethod is "+ref12.paymentMethod);
		System.out.println("the billDueDate is "+ref12.billDueDate);
		System.out.println("isTaxInclusive in the bill "+ref12.isTaxInclusive);
		System.out.println("isBillPaid "+ref12.isBillPaid);
		System.out.println("isBillOverDue "+ref12.isBillOverDue);
		
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
		
		System.out.println("the bill Id is "+ref13.billId);
		System.out.println("the bill amount  is "+ref13.billAmountWithTax);
		System.out.println("the planType  is "+ref13.planType);
		System.out.println("the billIssueDate is "+ref13.billIssueDate);
		System.out.println("the paymentMethod is "+ref13.paymentMethod);
		System.out.println("the billDueDate is "+ref13.billDueDate);
		System.out.println("isTaxInclusive in the bill "+ref13.isTaxInclusive);
		System.out.println("isBillPaid "+ref13.isBillPaid);
		System.out.println("isBillOverDue "+ref13.isBillOverDue);
		
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
		
		System.out.println("the bill Id is "+ref14.billId);
		System.out.println("the bill amount  is "+ref14.billAmountWithTax);
		System.out.println("the planType  is "+ref14.planType);
		System.out.println("the billIssueDate is "+ref14.billIssueDate);
		System.out.println("the paymentMethod is "+ref14.paymentMethod);
		System.out.println("the billDueDate is "+ref14.billDueDate);
		System.out.println("isTaxInclusive in the bill "+ref14.isTaxInclusive);
		System.out.println("isBillPaid "+ref14.isBillPaid);
		System.out.println("isBillOverDue "+ref14.isBillOverDue);
		
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
		
		System.out.println("the bill Id is "+ref15.billId);
		System.out.println("the firstbill amount  is "+ref15.billAmountWithTax);
		System.out.println("the planType  is "+ref15.planType);
		System.out.println("the billIssueDate is "+ref15.billIssueDate);
		System.out.println("the paymentMethod is "+ref15.paymentMethod);
		System.out.println("the billDueDate is "+ref15.billDueDate);
		System.out.println("isTaxInclusive in the bill "+ref15.isTaxInclusive);
		System.out.println("isBillPaid "+ref15.isBillPaid);
		System.out.println("isBillOverDue "+ref15.isBillOverDue);
		
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
		
		System.out.println("the bill Id is "+ref16.billId);
		System.out.println("the  bill amount  is "+ref16.billAmountWithTax);
		System.out.println("the planType  is "+ref16.planType);
		System.out.println("the billIssueDate is "+ref16.billIssueDate);
		System.out.println("the paymentMethod is "+ref16.paymentMethod);
		System.out.println("the billDueDate is "+ref16.billDueDate);
		System.out.println("isTaxInclusive in the bill "+ref16.isTaxInclusive);
		System.out.println("isBillPaid "+ref16.isBillPaid);
		System.out.println("isBillOverDue "+ref16.isBillOverDue);
		
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
		
		System.out.println("the bill Id is "+ref17.billId);
		System.out.println("the bill amount  is "+ref17.billAmountWithTax);
		System.out.println("the planType  is "+ref17.planType);
		System.out.println("the billIssueDate is "+ref17.billIssueDate);
		System.out.println("the paymentMethod is "+ref17.paymentMethod);
		System.out.println("the billDueDate is "+ref17.billDueDate);
		System.out.println("isTaxInclusive in the bill "+ref17.isTaxInclusive);
		System.out.println("isBillPaid "+ref17.isBillPaid);
		System.out.println("isBillOverDue "+ref17.isBillOverDue);
		
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
		
		System.out.println("the bill Id is "+ref18.billId);
		System.out.println("the bill amount  is "+ref18.billAmountWithTax);
		System.out.println("the planType  is "+ref18.planType);
		System.out.println("the billIssueDate is "+ref18.billIssueDate);
		System.out.println("the paymentMethod is "+ref18.paymentMethod);
		System.out.println("the billDueDate is "+ref18.billDueDate);
		System.out.println("isTaxInclusive in the bill "+ref18.isTaxInclusive);
		System.out.println("isBillPaid "+ref18.isBillPaid);
		System.out.println("isBillOverDue "+ref18.isBillOverDue);
		
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
		
		System.out.println("the bill Id is "+ref19.billId);
		System.out.println("the bill amount  is "+ref19.billAmountWithTax);
		System.out.println("the planType  is "+ref19.planType);
		System.out.println("the billIssueDate is "+ref19.billIssueDate);
		System.out.println("the paymentMethod is "+ref19.paymentMethod);
		System.out.println("the billDueDate is "+ref19.billDueDate);
		System.out.println("isTaxInclusive in the bill "+ref19.isTaxInclusive);
		System.out.println("isBillPaid "+ref19.isBillPaid);
		System.out.println("isBillOverDue "+ref19.isBillOverDue);
		
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
		
		System.out.println("the bill Id is "+ref20.billId);
		System.out.println("the bill amount  is "+ref20.billAmountWithTax);
		System.out.println("the planType  is "+ref20.planType);
		System.out.println("the billIssueDate is "+ref20.billIssueDate);
		System.out.println("the paymentMethod is "+ref20.paymentMethod);
		System.out.println("the billDueDate is "+ref20.billDueDate);
		System.out.println("isTaxInclusive in the bill "+ref20.isTaxInclusive);
		System.out.println("isBillPaid "+ref20.isBillPaid);
		System.out.println("isBillOverDue "+ref20.isBillOverDue);
		
		
		System.out.println("Main ended");
		
		
	}
}