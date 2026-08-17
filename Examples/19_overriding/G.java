class A {
    int pro() {
        return 1;
    }
}

class B extends A {
    // parameter type matched
    // return type must match if the return type is a primitive type 
    // Legal case of method overrirding
    int pro() {        
        return 11;
    }
}



