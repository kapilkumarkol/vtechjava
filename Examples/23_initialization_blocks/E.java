class A {
    {
        System.out.println("Hello");
    }

    A() {
        System.out.println("constructor call");
    }

    public static void main(String[] args) {
        System.out.println("A");

        A x = new A();
        // A y = new A();

        System.out.println("B");
    } 
}