class A {
    public static void main(String[] args) {
        Cat cat = new Cat();
        //Cat ---> Cat
        //no conversion required

        System.out.println(cat);
    }
}

class LivingBeing { }
class Animal extends LivingBeing { }
class Cat extends Animal { }
class Cow extends Animal { }
class Dog extends Animal { }
class BDog extends Dog{ }