class A {
    public static void main(String[] args) {
        // short w = 45;
        short w = 128;

        Short x = Short.valueOf(w);
        Short y = Short.valueOf(w);

        Short a = w;
        Short b = w;

        System.out.println(x == y);
        System.out.println(x == b);
        System.out.println(a == b);
    }
}