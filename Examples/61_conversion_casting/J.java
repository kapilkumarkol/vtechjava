class A {
    public static void main(String[] args) {
        Animal cat = new Cat();
        //(Variable(Parent))Animal --- (Value(Child))Cat
        //type mismatch! thus conversion is required
        //convertible? ---> yes -->how---> Parent - Child relation
        //which type of conversion? Widenning Conversion --> How ->> Child on right hand side found and variable is parent type
        //auto conversion (Implicit Conversion)

        System.out.println(cat);
    }
}

class LivingBeing { }
class Animal extends LivingBeing { }
class Cat extends Animal { }
class Cow extends Animal { }
class Dog extends Animal { }
class BDog extends Dog{ }