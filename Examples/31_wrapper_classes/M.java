class A {
    public static void main(String[] args) {
        // long e = 34L;
        long e = 128L;

        Long x = Long.valueOf(e);
        Long y = Long.valueOf(e);

        Long a = e;
        Long b = e;

        System.out.println(x == y);
        System.out.println(a == y);
        System.out.println(a == b);
    }
}