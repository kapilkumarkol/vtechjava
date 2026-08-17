class A {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3};

        pro(arr);
    }

    static void pro(int... x) {
        System.out.println(x.length);

        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
    }
}