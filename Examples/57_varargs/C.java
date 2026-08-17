class A {
    public static void main(String[] args) {

        // int[] arr = {12, 13};
        // int[] arr = {12, 13, 2};
        // int[] arr = {12, 13, 2, 10};
        // int[] arr = {12};
        int[] arr = {};
        
        int x = add(arr);

        System.out.println(x);
    }

    static int add(int[] a) {
        int sum = 0;

        for(int y : a) {
            sum += y;
        }

        return sum;
    }
}