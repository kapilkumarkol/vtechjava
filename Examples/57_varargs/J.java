class A {
    public static void main(String[] args) {
        char c = 'A';
        byte b = 23;
        short s = 345;
        int i = 56000;
        long l = 456789958;

        pro(c, b, s, i, (int)l);
    }

    static void pro(int... x) {
        System.out.println(x.length);

        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[3]);
        System.out.println(x[4]);
    }
}
