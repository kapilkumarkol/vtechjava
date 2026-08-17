class A {
    public static void main(String[] args) {
        Cat cat = new Animal();
        //(Variable(Child))Cat --- (Value(Parent))Animal
        //type mismatch! thus conversion is required
        //convertible? ---> yes -->how---> Child - Parent relation
        //which type of conversion? Narrowing Conversion --> How ->> Parent on right hand side found and variable is child type
        //foreced-conversion(Explicit Conversion) is required! But not available (Compilation fail)

        System.out.println(cat);
    }
}

class LivingBeing { }
class Animal extends LivingBeing { }
class Cat extends Animal { }
class Cow extends Animal { }
class Dog extends Animal { }
class BDog extends Dog{ }

// error: incompatible types: Animal cannot be converted to Cat