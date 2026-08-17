class A {
    public static void main(String[] args) {
        Animal[] y = new Cat[2];

        y[0] = new Cat();
        y[1] = new Dog();
    }
} 

class Animal { }   
class Cat extends Animal { }   
class Dog extends Animal { }   


// Exception in thread "main" java.lang.ArrayStoreException: Dog
//         at A.main(T.java:6)