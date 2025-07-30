class WeaponRunner {
    public static void main(String[] weapon) {

        Weapon ref1 = new Weapon(1, "Katana");
        System.out.println("the weapon id is " + ref1.weaponId);
		System.out.println("the name is " + ref1.name);
		
		Weapon ref2 = new Weapon("Sword", "Japan");
		System.out.println("the type is " + ref2.type);
		System.out.println("the origin is " + ref2.origin);
		
		Weapon ref3 = new Weapon("Slashing", 15000.0);
		System.out.println("the usage is " + ref3.usage);
		System.out.println("the price is " + ref3.price);
		
		
    }
}
