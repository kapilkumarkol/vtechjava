import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<Animal> x = new ArrayList<Animal>();

        Cat cat = new Cat();
        LivingBeing lb = new BDog();

        x.add(new Cat());
        x.add(new Cow());
        x.add(new Dog());
        x.add(new BDog());
        x.add(new Animal());
        x.add(cat);
        // x.add((Cat)lb);//not ok
        x.add((Animal)lb);
        x.add((Dog)lb);
        x.add((BDog)lb);

        System.out.println(x);
    }
}


class LivingBeing { } 
class Animal extends LivingBeing{ }
class Cat extends Animal { }
class Dog extends Animal { }
class BDog extends Dog { }
class Cow extends Animal { }
