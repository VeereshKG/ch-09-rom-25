class PlayStore{

// static String  tinder = "Tinder";
// static String  instagram = "Instagram";
// static String  whatsApp = "WhatsApp";
// static String linkedIn = "LinkedIn";
// static String  phonePe= "PhonePe";
// static String  apna= "Apna";
// static String naukri = "Naukri";
// static String jobToday = "JobToday";
// static String indeed = "Indeed";
// static String glassDoor = "GlassDoor";

// static String appNames[] = {tinder,instagram,whatsApp,linkedIn,phonePe,apna,naukri,jobToday,indeed,glassDoor};

// static String appNames[] = {"Tinder","Instagram","WhatsApp","LinkedIn","PhonePe","Apna","Naukri","JobToday","Indeed","Glassdoor"};

public static void main(String []app){

// System.out.println("Apps Available in the PlayStore : "+" "+appNames[0]+" "+appNames[1]+" "+appNames[2]+" "+appNames[3]+" "+appNames[4]+" "+appNames[5]+" "+appNames[6]+" "+appNames[7]+" "+appNames[8]+" "+appNames[9]);

 String  tinder = "Tinder";
 String  instagram = "Instagram";
 String  whatsApp = "WhatsApp";
 String linkedIn = "LinkedIn";
 String  phonePe= "PhonePe";
 String  apna= "Apna";
 String naukri = "Naukri";
 String jobToday = "JobToday";
 String indeed = "Indeed";
 String glassDoor = "GlassDoor";

 String appNames[] = {tinder,instagram,whatsApp,linkedIn,phonePe,apna,naukri,jobToday,indeed,glassDoor};

System.out.println("Apps Available in the PlayStore :");
for(String appName:appNames){
	System.out.println(appName);
}
}
}