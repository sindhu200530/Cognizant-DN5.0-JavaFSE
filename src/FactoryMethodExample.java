// Step 1 - Abstract Animal
abstract class Animal {
    abstract void speak();
}

// Step 2 - Concrete classes
class Dog extends Animal {
    public void speak() {
        System.out.println("Dog says: Woof!");
    }
}

class Cat extends Animal {
    public void speak() {
        System.out.println("Cat says: Meow!");
    }
}

// Step 3 - Factory class
class AnimalFactory {
    public static Animal getAnimal(String type) {
        if (type.equals("Dog")) return new Dog();
        else if (type.equals("Cat")) return new Cat();
        return null;
    }
}

// Step 4 - Main
public class FactoryMethodExample {
    public static void main(String[] args) {
        Animal a1 = AnimalFactory.getAnimal("Dog");
        Animal a2 = AnimalFactory.getAnimal("Cat");

        a1.speak();
        a2.speak();
    }
}