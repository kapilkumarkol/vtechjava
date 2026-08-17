class A {
    void pro(Animal a) {

    }
}

class B extends A {
    // parameter type mismatched
    // illegal case of method overrirding
    // legal case of method overloading
    void pro(Dog a) {

    }
}

class Animal {

}

class Dog extends Animal {


}