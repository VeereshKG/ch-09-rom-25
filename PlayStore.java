class PlayStore{

static String appNames[] = {"Tinder","Instagram","WhatsApp","LinkedIn","PhonePe","Apna","Naukri","JobToday","Indeed","Glassdoor"};

public static void main(String []app){

// System.out.println("Apps Available in the PlayStore : "+" "+appNames[0]+" "+appNames[1]+" "+appNames[2]+" "+appNames[3]+" "+appNames[4]+" "+appNames[5]+" "+appNames[6]+" "+appNames[7]+" "+appNames[8]+" "+appNames[9]);

System.out.println("Apps Available in the PlayStore :");
for(String appName:appNames){
	System.out.println(appName);
}
}
}