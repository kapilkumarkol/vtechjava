import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<? super Dog> x1 = new ArrayList<Dog>();
        ArrayList<? super Dog> x2 = new ArrayList<Animal>();
        ArrayList<? super Dog> x3 = new ArrayList<LivingBeing>();
        ArrayList<? super Dog> x4 = new ArrayList<Object>();
    }
}


class LivingBeing { }
class Animal extends LivingBeing{ }
class Cat extends Animal { }
class Dog extends Animal { }
class BDog extends Dog { }
class Cow extends Animal { }
