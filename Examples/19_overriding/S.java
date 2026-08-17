class A {
    //Private Access contrl is applied
    private void pro() {
        
    }
}

class B extends A {
    // parameter type must matched
    // return type must match if the return type is a reference type
    // even you can write a subclass in return type...
    // it is just a coninsidence that you have created a method with same name in your subclass
    // because the parent class method is private and is not visible to child class
    //Case 1:
    // public int pro() {        
    //     return 2;
    // }

    //Case 2:
    // protected int pro() {        
    //     return 2;
    // }

    //Case 3:
    // int pro() {        
    //     return 2;
    // }

    //Case 4:
    private int pro() {        
        return 2;
    }
}
