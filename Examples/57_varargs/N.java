class A {
    public static void main(String[] args) {
        pro(49, 5, 2);
    }

    static void pro(float... x) {
        System.out.println(x.length);
    }
}