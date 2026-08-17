class A {
    // compile time polymorphism...
    static void pro(Animal x) {
        System.out.println("Animal ~");
    }

    static void pro(Dog y) {
        System.out.println("Dog ~");
    }
}

class X {
    public static void main(String[] args) {
        Animal t = new Dog();

        A a = new A();
        a.pro(t); 
    }
}

class Animal { }

class Dog extends Animal { }