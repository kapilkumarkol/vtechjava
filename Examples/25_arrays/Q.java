class A {
    public static void main(String[] args) {
        Cat c = new Cat();

        Dog d = new Dog();

        Cow w = new Cow();

        BDog b = new BDog();

        LivingBeing l = new BDog();
        
        Animal[] x = {c, d, w, b};

        for(int i=0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }
}

class LivingBeing { }
class Animal extends LivingBeing { }
class Dog extends Animal { }
class BDog extends Dog { }
class Cat extends Animal { }
class Cow extends Animal { }