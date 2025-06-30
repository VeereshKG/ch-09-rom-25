class Hospital {

static String doctorNames[] = {"Dr.VarunGoel","Dr.ManoharJ","Dr.UmeshKumar","Dr.RaghuramaN","Dr.SapnaNangia","Dr.RajuVaishya","Dr.Jindal","Dr.Kamaldeep","Dr.Chandana","Dr.Garg"};

public static void main(String []doctors){

//System.out.println("Name Of The Doctors: "+" "+doctorNames[0]+" "+doctorNames[1]+" "+doctorNames[2]+" "+doctorNames[3]+" "+doctorNames[4]+" "+doctorNames[5]+" "+doctorNames[6]+" "+doctorNames[7]+" "+doctorNames[8]+" "+doctorNames[9]);

	  System.out.println("The List of Doctors are : ");

  for(String  doctor : doctorNames){
	  
	  System.out.println(doctor);
  }

}
}