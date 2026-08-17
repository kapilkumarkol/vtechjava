import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<Animal> x = new ArrayList<Animal>();

        Cat cat = new Cat();
        LivingBeing lb = new Dog();

        x.add(new Cat());
        x.add(new Cow());
        x.add(new Dog());
        x.add(new BDog());
        x.add(new Animal());
        x.add(cat);
        x.add(lb);

        System.out.println(x);
    }
}


class LivingBeing { } 
class Animal extends LivingBeing{ }
class Cat extends Animal { }
class Dog extends Animal { }
class BDog extends Dog { }
class Cow extends Animal { }

// L.java:16: error: incompatible types: LivingBeing cannot be converted to Animal
//         x.add(lb);
//               ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 1 error