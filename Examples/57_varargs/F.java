class A {
    public static void main(String[] args) {
        // int x = add();
        // int x = add(3);
        // int x = add(3, 5);
        // int x = add(3, 5, 10);
        // int x = add(3, 5, 10, 2, 1, 5, 7);

        int[] ar = {45, 12, 2, 9};
        int x = add(ar);

        System.out.println(x);
    }

    static int add(int... arr) {
        int sum = 0;

        for(int y : arr) {
            sum += y;
        }

        return sum;
    } 
}