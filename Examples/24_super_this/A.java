class A {
    int y = 1000;

    {
        System.out.println(y);
    }
    
    A() {
        // super();
        // inst. init. block
        System.out.println(y);
    }

    public static void main(String[] args) {
        A x = new A();

        System.out.println(x.y);
    }
}