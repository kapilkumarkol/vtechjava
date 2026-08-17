class A {
    public static void main(String[] args) {
        int[] y = pro();

        for(int a : y) {
            System.out.println(a);
        }
    }

    static int[] pro() {
        int[] x = {1, 2, 3, 5};

        return x;
    }
}