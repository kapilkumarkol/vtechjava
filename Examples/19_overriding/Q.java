class A {
    //Protected Access contrl is applied
    protected void pro() {
        
    }
}

class B extends A {
    // parameter type must matched
    // return type must match if the return type is a reference type
    // even you can write a subclass in return type...
    // same or wider access control can be applied when defining an overriding method
    // Legal case of method overrirding
    // Public or Protected Access control can be applied
    //Case 1:
    // public void pro() {        
        
    // }

    //Case 2:
    // protected void pro() {        
        
    // }

    //Case 3:   NOT OK
    // void pro() {        
        
    // }

    //Case 4:  NOT OK
    // private void pro() {        
        
    // }
}
