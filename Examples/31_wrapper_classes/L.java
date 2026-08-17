class A {
    public static void main(String[] args) {
        // int g = 12;
        int g = 128;

        Integer a = Integer.valueOf(g);
        Integer b = Integer.valueOf(g);

        Integer x = g;
        Integer y = g;

        System.out.println(a == b);
        System.out.println(x == b);
        System.out.println(x == y);
    }
}