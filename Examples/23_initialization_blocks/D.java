class A {
    {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        System.out.println("A");

        A x = new A();
        A y = new A();
        A z = new A();

        System.out.println("B");
    }
}