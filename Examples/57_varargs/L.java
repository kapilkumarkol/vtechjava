class A {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();
        BDog bdog = new BDog();
        Animal animal = new Animal();
        LivingBeing lb = new Cat();

        pro(cat, cow, dog, bdog, animal, lb);
    }

    static void pro(Animal... anms) {
        System.out.println(anms.length);

        System.out.println(anms[0]);
        System.out.println(anms[1]);
        System.out.println(anms[2]);
        System.out.println(anms[3]);
        System.out.println(anms[4]);
    }
}

class LivingBeing { }
class Animal extends LivingBeing { }
class Cat extends Animal { }
class Cow extends Animal { }
class Dog extends Animal { }
class BDog extends Dog { }


// L.java:10: error: method pro in class A cannot be applied to given types;
//         pro(cat, cow, dog, bdog, animal, lb);
//         ^
//   required: Animal[]
//   found: Cat,Cow,Dog,BDog,Animal,LivingBeing
//   reason: varargs mismatch; LivingBeing cannot be converted to Animal
// 1 error