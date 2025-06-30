class City{

static int pincodes[] = {560058,572116,482001,560052,587124,590020,591112,561204,585417,585329,577548,577230,577221};

public static void main(String []pin){

// System.out.println("City Pincodes : "+" "+pincodes[0]+" "+pincodes[1]+" "+pincodes[2]+" "+pincodes[3]+" "+pincodes[4]+" "+pincodes[5]+" "+pincodes[6]+" "+pincodes[7]+" "+pincodes[8]+" "+pincodes[9]+" "+pincodes[10]+" "+pincodes[11]+" "+pincodes[12]);

System.out.println("City Pincodes : ");
for(int pincode : pincodes){
	System.out.println(pincode);
}

}

}