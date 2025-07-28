class Weapon{
	
	 Weapon() {
        System.out.println("the constructor is invoked");
    }

    Weapon(int weaponId, String name, String type, String origin, String usage, double price) {
        System.out.println("the parameterized constructor is invoked");

        this.weaponId = weaponId;
        this.name = name;
        this.type = type;
        this.origin = origin;
        this.usage = usage;
        this.price = price;
    }
	
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