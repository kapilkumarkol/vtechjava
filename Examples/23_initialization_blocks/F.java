class X {
    {     System.out.println("hi");  }

    X() {      System.out.println("X const call"); }
}

class A extends X {
    {     System.out.println("Hello");  }

    A() {   System.out.println("A const. call");  }

    public static void main(String[] args) {
        System.out.println("A");

        A x = new A();

        System.out.println("B");
    } 
}