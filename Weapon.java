class Weapon{
	
    int weaponId;
	String name;
	String type;
	String origin;
	String usage;
	double price;
	
	public void getWeaponInfo(){
		
		System.out.println("the weapon id is " + weaponId);
		System.out.println("the name is " + name);
		System.out.println("the type is " + type);
		System.out.println("the origin is " + origin);
		System.out.println("the usage is " + usage);
		System.out.println("the price is " + price);
		System.out.println("");
		
	}
}