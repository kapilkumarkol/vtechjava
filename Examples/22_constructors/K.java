class A {
    static int count;

    A() {
        count++;
    }

    public static void main(String[] args) {
        A x = new A();
        A y = new A();
        A z = new A();
        A t = new A();
        A e = new A();       

        
        System.out.println(x.count);
    }
}