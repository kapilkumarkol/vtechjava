import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        Animal[] x = new Dog[3];

        x[0] = new Dog();
        x[1] = new Cat();

        System.out.println(x);
    }
}



class Animal extends LivingBeing{ }
class Cat extends Animal { }
class Dog extends Animal { }
class BDog extends Dog { }
class Cow extends Animal { }
