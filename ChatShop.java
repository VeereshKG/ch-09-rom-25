class ChatShop {

// static String paniPuri = "PaniPuri";
// static String bhelpuri = "BhelPuri";
// static String dahipuri = "DahiPuri";
// static String sevpuri = "SevPuri";
// static String kalachana = "KalaChana";
// static String corn = "Corn";
// static String samosa = "Samosa";
// static String avocadopapdi = "AvocadoPapdi";
// static String fruitchaat = "FruitChaat";
// static String vadpav = "Vadpav";

// static String chaats[] = {paniPuri,bhelpuri,dahipuri,sevpuri,kalachana,vadpav,corn,samosa,avocadopapdi,fruitchaat};

// static String chaats[] = {"PaniPuri","BhelPuri","DahiPuri","SevPuri","KalaChana","Corn","Samosa","AvocadoPapdi","FruitChaat","Vadpav"};

public static void main(String []chats){

// System.out.println(chaats[0]+" "+chaats[1]+" "+chaats[2]+" "+chaats[3]+" "+chaats[4]+" "+chaats[5]+" "+chaats[6]+" "+chaats[7]+" "+chaats[8]+" "+chaats[9]);

String paniPuri = "PaniPuri";
String bhelpuri = "BhelPuri";
String dahipuri = "DahiPuri";
String sevpuri = "SevPuri";
String kalachana = "KalaChana";
String corn = "Corn";
String samosa = "Samosa";
String avocadopapdi = "AvocadoPapdi";
String fruitchaat = "FruitChaat";
String vadpav = "Vadpav";

String chaats[] = {paniPuri,bhelpuri,dahipuri,sevpuri,kalachana,vadpav,corn,samosa,avocadopapdi,fruitchaat};


System.out.println("the types of chaats available :");
for(String chat:chaats){
	System.out.println(chat);
}

}
}