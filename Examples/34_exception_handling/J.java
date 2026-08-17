class A {
    public static void main(String[] args) {
        int x = pro();

        System.out.println(x);
    }

    static int pro() {
        try {
            System.out.println("A");
            return 99;
        } finally {
            System.out.println("B");
            return 88;
        }
    }
}