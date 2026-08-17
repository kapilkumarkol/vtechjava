class A {
    public static void main(String[] args) {
        // int x = add(12, 13);

        int[] arr = {12, 13};
        int x = add(arr);

        System.out.println(x);
    }

    static int add(int a, int b) {
        return a + b;
    }
}