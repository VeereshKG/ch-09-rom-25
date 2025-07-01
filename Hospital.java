class Hospital {

// static String varunGoel = "Dr.VarunGoel";
// static String manoharJ = "Dr.ManoharJ";
// static String umeshKumar = "Dr.UmeshKumar";
// static String raghuramaN = "Dr.RaghuramaN";
// static String sapnaNangia = "Dr.SapnaNangia";
// static String rajuVaishya = "Dr.RajuVaishya";
// static String jindal = "Dr.Jindal";
// static String kamaldeep = "Dr.Kamaldeep";
// static String chandana = "Dr.Chandana";
// static String garg= "Dr.Garg";

// static String doctorNames[] = {varunGoel,sapnaNangia,raghuramaN,umeshKumar,manoharJ,garg,chandana,kamaldeep,jindal,rajuVaishya};

// static String doctorNames[] = {"Dr.VarunGoel","Dr.ManoharJ","Dr.UmeshKumar","Dr.RaghuramaN","Dr.SapnaNangia","Dr.RajuVaishya","Dr.Jindal","Dr.Kamaldeep","Dr.Chandana","Dr.Garg"};

public static void main(String []doctors){

//System.out.println("Name Of The Doctors: "+" "+doctorNames[0]+" "+doctorNames[1]+" "+doctorNames[2]+" "+doctorNames[3]+" "+doctorNames[4]+" "+doctorNames[5]+" "+doctorNames[6]+" "+doctorNames[7]+" "+doctorNames[8]+" "+doctorNames[9]);

String varunGoel = "Dr.VarunGoel";
String manoharJ = "Dr.ManoharJ";
String umeshKumar = "Dr.UmeshKumar";
String raghuramaN = "Dr.RaghuramaN";
String sapnaNangia = "Dr.SapnaNangia";
String rajuVaishya = "Dr.RajuVaishya";
String jindal = "Dr.Jindal";
String kamaldeep = "Dr.Kamaldeep";
String chandana = "Dr.Chandana";
String garg= "Dr.Garg";

String doctorNames[] = {varunGoel,sapnaNangia,raghuramaN,umeshKumar,manoharJ,garg,chandana,kamaldeep,jindal,rajuVaishya};

	  System.out.println("The List of Doctors are : ");

  for(String  doctor : doctorNames){
	  
	  System.out.println(doctor);
  }

}
}