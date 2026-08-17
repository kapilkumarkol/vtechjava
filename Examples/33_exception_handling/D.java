class A {
    public static void main(String[] args) {
        System.out.println(1);
        
        Animal x = new Dog();
        
        Cat y = (Cat)x;

        System.out.println(2);
    }
}

class Animal { }
class Cat extends Animal { }
class Dog extends Animal { }

// Exception in thread "main" java.lang.ClassCastException: class Dog cannot be cast to class Cat (Dog and Cat are in unnamed module of loader 'app')
//         at A.main(D.java:7)