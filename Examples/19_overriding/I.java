class A {
    Animal pro() {
        return null;
    }
}

class B extends A {
    // parameter type matched
    // return type must match if the return type is a reference type
    // even you can write a subclass in return type... 
    // Legal case of method overrirding
    Animal pro() {        
        return null;
    }
}

class LivingBeing { }
class Animal extends LivingBeing { }
class Dog extends Animal { }
class Cat extends Animal { }
class Cow extends Animal { }

class BDog extends Dog { }
