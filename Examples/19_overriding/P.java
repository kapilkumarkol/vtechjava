class A {
    //Default Access contrl is applied
    void pro() {
        
    }
}

class B extends A {
    // parameter type must matched
    // return type must match if the return type is a reference type
    // even you can write a subclass in return type...
    // same or wider access control can be applied when defining an overriding method
    // Legal case of method overrirding
    // Public, Protected or Default Access control can be applied
    private void pro() {        
        
    }
}

/*
P.java:15: error: pro() in B cannot override pro() in A
    private void pro() {        
                 ^
  attempting to assign weaker access privileges; was package
1 error
 */