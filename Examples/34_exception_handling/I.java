class A {
    public static void main(String[] args) {
        int x = pro();

        System.out.println(x);
    }

    static int pro() {
        try {
            return 34;
        } catch(ArithmeticException e) {
            return 56;
        }
    }
}