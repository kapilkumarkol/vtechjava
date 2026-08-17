class A {
    static void playSound(Animal x) {
        // decided at run time, which method to call 
        // all depands which chlid object is assigned at run time
        // runtime polymorphism
        // dynamic method dispatch desideds which method version to call
        x.makeSound();
    }

    // static void playSound(Cat x) {
    //     x.makeSound();
    // }

    // static void playSound(Dog x) {
    //     x.makeSound();
    // }

    // static void playSound(Cow x) {
    //     x.makeSound();
    // }

    public static void main(String[] args) {
        Cow cow = new Cow();
        playSound(cow);
        
        Cat cat = new Cat();
        playSound(cat);

        Dog dog = new Dog();
        playSound(dog);        
    }
}


class Animal {
    void makeSound() {
        System.out.println("Animal Sound.... ");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat Sound.... $ ");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog Sound.... # ");
    }
}

class Cow extends Animal {
    void makeSound() {
        System.out.println("Cow Sound.... % ");
    }
}
