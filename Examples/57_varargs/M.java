class A {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();
        BDog bdog = new BDog();
        Animal animal = new Animal();
        LivingBeing lb = new Cat();

        pro(cat, cow, dog, bdog, animal, (Cat)lb);
    }

    static void pro(Animal... anms) {
        System.out.println(anms.length);

        System.out.println(anms[0]);
        System.out.println(anms[1]);
        System.out.println(anms[2]);
        System.out.println(anms[3]);
        System.out.println(anms[4]);
        System.out.println(anms[5]);
    }
}

class LivingBeing { }
class Animal extends LivingBeing { }
class Cat extends Animal { }
class Cow extends Animal { }
class Dog extends Animal { }
class BDog extends Dog { }

