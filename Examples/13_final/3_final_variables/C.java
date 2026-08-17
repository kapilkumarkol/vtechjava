class A {
    final double w = 3.45;

    public static void main(String[] args) {
        A a = new A();

        System.out.println(a.w);

        a.w = 9.34;
    }
}

// error: cannot assign a value to final variable w