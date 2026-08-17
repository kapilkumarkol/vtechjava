class A {
    // Valid Method
    void A() {
        System.out.println("Hi golu");
    }

    public static void main(String[] args) {
        A x = new A();
        //new A() is a constructor call
        
        x.A();
        // x.A() is a method call...
    }
}