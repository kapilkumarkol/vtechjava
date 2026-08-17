class A {

    {
        System.out.println(this+" 1");
    }
    
    A() {
        // super();
        // inst. init. block
        System.out.println(this+" 2");
    }

    public static void main(String[] args) {
        A x = new A();
        System.out.println(x+" 3a");
        
        System.out.println("++++++++++++++++++++++");

        A z = new A();
        System.out.println(z+" 3b");
    }
}