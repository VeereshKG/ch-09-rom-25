class SuperMarket{

static String iceCreams[] = {"ButterScotch","Vanilla","Chocolate","Strawberry","Pistachio","BlackCurrent","Mango","BlueBerry","RaspBerry","Caramel"};

static String perfumes[] = {"MCaffeine","Denver","Gucci","Dior","CreedViking","CreedErolfa","Azzaro","BVLGari","Hermes","Dunhill"};

static String groceries[] = {"Beans","Broccoli","Peas","Spinach","Onions","Kiwi","Cucumber","Tomato","Butter","Eggs"};

static String cosmetics[] = {"Foundation","SunScreens","Moisturizers","Blush","Lipstick","Powder","LipBalm","Mascara","FaceWash","HairSpray"};

public static void main(String []supermarket){

// System.out.println("List of ice Cream Flavors: "+" "+iceCreams[0]+" "+iceCreams[1]+" "+iceCreams[2]+" "+iceCreams[3]+" "+iceCreams[4]+" "+iceCreams[5]+" "+iceCreams[6]+" "+iceCreams[7]+" "+iceCreams[8]+" "+iceCreams[9]);

// System.out.println("List of Perfumes Brands: "+" "+Perfumes[0]+" "+Perfumes[1]+" "+Perfumes[2]+" "+Perfumes[3]+" "+Perfumes[4]+" "+Perfumes[5]+" "+Perfumes[6]+" "+Perfumes[7]+" "+Perfumes[8]+" "+Perfumes[9]);

// System.out.println("List of Groceries: "+" "+groceries[0]+" "+groceries[1]+" "+groceries[2]+" "+groceries[3]+" "+groceries[4]+" "+groceries[5]+" "+groceries[6]+" "+groceries[7]+" "+groceries[8]+" "+groceries[9]);

// System.out.println("List of Cosmetics: "+" "+cosmetics[0]+" "+cosmetics[1]+" "+cosmetics[2]+" "+cosmetics[3]+" "+cosmetics[4]+" "+cosmetics[5]+" "+cosmetics[6]+" "+cosmetics[7]+" "+cosmetics[8]+" "+cosmetics[9]);

System.out.println("List of ice Cream Flavors :");
for(String iceCream:iceCreams){
	System.out.println(iceCream);
}

System.out.println("List of Perfumes Brands :");
for(String perfume:perfumes){
	System.out.println(perfume);
}

System.out.println("List of Groceries :");
for(String grocerie:groceries){
	System.out.println(grocerie);
}

System.out.println("List of Cosmetics :");
for(String cosmetic:cosmetics){
	System.out.println(cosmetic);
	}

}
}