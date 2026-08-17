class A {
    private final void pro() {
        System.out.println("Hello Maharaj ji");
    }
}

class B extends A {
    // void pro() {
    //     System.out.println("Hello Samrat");
    // }
    public static void main(String[] args) {
        B x = new B();

        x.pro();
    }
}

/*
D1.java:14: error: cannot find symbol
        x.pro();
         ^
  symbol:   method pro()
  location: variable x of type B
1 error
 */