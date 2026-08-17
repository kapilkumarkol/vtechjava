class A {
    W pro() {
        return null;
    }
}

class B extends A {
    // parameter type matched
    // return type must match if the return type is a reference type
    // even you can write a subclass in return type... 
    // Legal case of method overrirding
    X pro() {        
        return null;
    }
}

interface W { }

interface X extends W { }