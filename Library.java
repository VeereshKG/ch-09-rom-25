class Library{

static String bookNames[] = {"TheWhiteTiger","ASuitableBoy","TheNamesake","SeaOfPoppies","IndiaAfterGandhi","MaximumCity","BuddhistIndia","AryanRuleIndia",};

public static void main(String []book){
// System.out.println("Book Names Available in the Library : "+" "+bookNames[0]+" "+bookNames[1]+" "+bookNames[2]+" "+bookNames[3]+" "+bookNames[4]+" "+bookNames[5]+" "+bookNames[6]+" "+bookNames[7]);

System.out.println("Book Names Available in the Library : ");
for(String bookName:bookNames){
	System.out.println(bookName);
}
}
}