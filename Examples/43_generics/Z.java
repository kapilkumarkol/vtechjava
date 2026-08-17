import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<? super Dog> x1 = new ArrayList<Dog>();
        ArrayList<? super Dog> x2 = new ArrayList<Animal>();
        ArrayList<? super Dog> x3 = new ArrayList<LivingBeing>();
        ArrayList<? super Dog> y = new ArrayList<Object>();

        // ArrayList<Object> y = new ArrayList<Object>();
        // y.add(new Bus());
        // y.add(new Employee());
        // y.add(new Animal());
        // y.add(new LivingBeing());
        // y.add(new Object());

        y.add(new Dog());
        y.add(new BDog());

    }
}

class Bus{ }
class Employee { }

class LivingBeing { }
class Animal extends LivingBeing{ }
class Cat extends Animal { }
class Dog extends Animal { }
class BDog extends Dog { }
class Cow extends Animal { }
