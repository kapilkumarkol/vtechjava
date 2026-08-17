class A {
    public static void main(String[] args) {
        int x = pro();

        System.out.println(x);
    }

    static int pro() {
        try {
            return 99;
        } catch(ArithmeticException e) {
         
        }

        return 1;
    }
}