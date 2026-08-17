class A {
    A pro() {
        return this; 
    }

    public static void main(String[] args) {
        A x = new A();

        A y = x.pro();

        System.out.println(x == y);
        System.out.println(x);
        System.out.println(y);
    }
}