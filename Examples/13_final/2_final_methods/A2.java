class A {
    final void pro() {
        System.out.println("pro in A");
    }

    void info() {
        System.out.println("info in A");
    }
}

class B extends A {
    void pro() {
        System.out.println("pro in B");
    }

    void info() {
        System.out.println("info in B");
    }
}

/*
A2.java:12: error: pro() in B cannot override pro() in A
    void pro() {
         ^
  overridden method is final
1 error
 */