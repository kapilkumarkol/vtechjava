class A {
    public static void main(String[] args) {
        Machine cat = new Cat();
        //(Variable)Machine --- (Value)Cat
        //type mismatch! thus conversion is required
        //convertible? ---> no (Compilation Fail)

        System.out.println(cat);
    }
}

class Machine { }

class LivingBeing { }
class Animal extends LivingBeing { }
class Cat extends Animal { }
class Cow extends Animal { }
class Dog extends Animal { }
class BDog extends Dog{ }

// error: incompatible types: Cat cannot be converted to Machine