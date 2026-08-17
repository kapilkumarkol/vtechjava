class A {
    public static void main(String[] args) {
        System.out.println(1);

        try {
            int y = 34 / 0;
        } catch(ArithmeticException e) {
            System.out.println("AE");
        }

        System.out.println(2);
    }
}