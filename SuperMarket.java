class SuperMarket{

// static String butterScotch =  "ButterScotch";
// static String vanilla =  "Vanilla";
// static String chocolate =  "Chocolate";
// static String strawberry =  "Strawberry";
// static String pistachio =  "Pistachio";
// static String blackCurrent =  "BlackCurrent";
// static String mango =  "Mango";
// static String blueBerry =  "BlueBerry";
// static String raspBerry =  "RaspBerry";
// static String caramel =  "Caramel";

// static String iceCreams[] = {butterScotch,vanilla,chocolate,strawberry,pistachio,blackCurrent,mango,blueBerry,raspBerry,caramel};

// static String iceCreams[] = {"ButterScotch","Vanilla","Chocolate","Strawberry","Pistachio","BlackCurrent","MangoMango","BlueBerryBlueBerry","RaspBerry","Caramel"};

// static String  mCaffeine=  "MCaffeine";
// static String  denver=  "Denver";
// static String gucci =  "Gucci";
// static String  dior=  "Dior";
// static String  creedViking=  "CreedViking";
// static String creedErolfa =  "CreedErolfa";
// static String azzaro =  "Azzaro";
// static String bVLGari =  "BVLGari";
// static String hermes =  "Hermes";
// static String dunhill =  "Dunhill";

// static String perfumes[] = {mCaffeine,denver,gucci,dior,creedErolfa ,creedViking,azzaro,bVLGari,hermes,dunhill};

// static String perfumes[] = {"MCaffeine","Denver","Gucci","Dior","CreedViking","CreedErolfa","Azzaro","BVLGari","Hermes","Dunhill"};

// static String beans =  "Beans";
// static String broccoli =  "Broccoli";
// static String peas =  "Peas";
// static String spinach =  "Spinach";
// static String kiwi =  "Kiwi";
// static String cucumber =  "Cucumber";
// static String tomato =  "Tomato";
// static String butter =  "Butter";
// static String eggs =  "Eggs";
// static String onions =  "Onions";

// static String groceries[] = {beans,broccoli,peas,spinach,kiwi,cucumber,tomato,butter,eggs,onions};

// static String groceries[] = {"Beans","Broccoli","Peas","Spinach","Onions","Kiwi","Cucumber","Tomato","Butter","Eggs"};

// static String foundation =  "Foundation";
// static String sunScreens =  "SunScreens";
// static String  moisturizers=  "Moisturizers";
// static String  blush=  "Blush";
// static String lipstick =  "Lipstick";
// static String powder =  "Powder";
// static String lipBalm=  "LipBalm";
// static String mascara =  "Mascara";
// static String faceWash =  "FaceWash";
// static String  hairSpray=  "HairSpray";

// static String cosmetics[] = {foundation,sunScreens,moisturizers,blush,lipBalm,lipstick,powder,mascara,faceWash,hairSpray};

// static String cosmetics[] = {"Foundation","SunScreens","Moisturizers","Blush","Lipstick","Powder","LipBalm","Mascara","FaceWash","HairSpray"};

public static void main(String []supermarket){

// System.out.println("List of ice Cream Flavors: "+" "+iceCreams[0]+" "+iceCreams[1]+" "+iceCreams[2]+" "+iceCreams[3]+" "+iceCreams[4]+" "+iceCreams[5]+" "+iceCreams[6]+" "+iceCreams[7]+" "+iceCreams[8]+" "+iceCreams[9]);

// System.out.println("List of Perfumes Brands: "+" "+Perfumes[0]+" "+Perfumes[1]+" "+Perfumes[2]+" "+Perfumes[3]+" "+Perfumes[4]+" "+Perfumes[5]+" "+Perfumes[6]+" "+Perfumes[7]+" "+Perfumes[8]+" "+Perfumes[9]);

// System.out.println("List of Groceries: "+" "+groceries[0]+" "+groceries[1]+" "+groceries[2]+" "+groceries[3]+" "+groceries[4]+" "+groceries[5]+" "+groceries[6]+" "+groceries[7]+" "+groceries[8]+" "+groceries[9]);

// System.out.println("List of Cosmetics: "+" "+cosmetics[0]+" "+cosmetics[1]+" "+cosmetics[2]+" "+cosmetics[3]+" "+cosmetics[4]+" "+cosmetics[5]+" "+cosmetics[6]+" "+cosmetics[7]+" "+cosmetics[8]+" "+cosmetics[9]);

 String butterScotch =  "ButterScotch";
 String vanilla =  "Vanilla";
 String chocolate =  "Chocolate";
 String strawberry =  "Strawberry";
 String pistachio =  "Pistachio";
 String blackCurrent =  "BlackCurrent";
 String mango =  "Mango";
 String blueBerry =  "BlueBerry";
 String raspBerry =  "RaspBerry";
 String caramel =  "Caramel";
 
 String iceCreams[] = {butterScotch,vanilla,chocolate,strawberry,pistachio,blackCurrent,mango,blueBerry,raspBerry,caramel};

System.out.println("List of ice Cream Flavors :");
for(String iceCream:iceCreams){
	System.out.println(iceCream);
}

String  mCaffeine=  "MCaffeine";
String  denver=  "Denver";
String gucci =  "Gucci";
String  dior=  "Dior";
String  creedViking=  "CreedViking";
String creedErolfa =  "CreedErolfa";
String azzaro =  "Azzaro";
String bVLGari =  "BVLGari";
String hermes =  "Hermes";
String dunhill =  "Dunhill";

String perfumes[] = {mCaffeine,denver,gucci,dior,creedErolfa ,creedViking,azzaro,bVLGari,hermes,dunhill};

System.out.println("List of Perfumes Brands :");
for(String perfume:perfumes){
	System.out.println(perfume);
}

String beans =  "Beans";
String broccoli =  "Broccoli";
String peas =  "Peas";
String spinach =  "Spinach";
String kiwi =  "Kiwi";
String cucumber =  "Cucumber";
String tomato =  "Tomato";
String butter =  "Butter";
String eggs =  "Eggs";
String onions =  "Onions";

String groceries[] = {beans,broccoli,peas,spinach,kiwi,cucumber,tomato,butter,eggs,onions};

System.out.println("List of Groceries :");
for(String grocerie:groceries){
	System.out.println(grocerie);
}

String foundation =  "Foundation";
String sunScreens =  "SunScreens";
String  moisturizers=  "Moisturizers";
String  blush=  "Blush";
String lipstick =  "Lipstick";
String powder =  "Powder";
String lipBalm=  "LipBalm";
String mascara =  "Mascara";
String faceWash =  "FaceWash";
String  hairSpray=  "HairSpray";

String cosmetics[] = {foundation,sunScreens,moisturizers,blush,lipBalm,lipstick,powder,mascara,faceWash,hairSpray};

System.out.println("List of Cosmetics :");
for(String cosmetic:cosmetics){
	System.out.println(cosmetic);
	}

}
}