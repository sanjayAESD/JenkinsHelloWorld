package polymorhism;

public class Animal {

	
	void eat() {
		
		System.out.println("Animal is eating");
	}
}


class Tiger extends Animal{
	
	void eat() {
		
		System.out.println("Tiger hunts annd eat");
	}
	
}

class Monkey extends Animal{
	
	void eat() {
		
		System.out.println("Monkey snatches and eat");
	}
}

class Forest {
	
	
	void allowAnimal(Animal ref) {
		
		ref.eat();
		
	}
}