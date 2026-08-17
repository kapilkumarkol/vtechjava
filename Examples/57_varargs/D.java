class A {
    public static void main(String[] args) {

        
        // int x = add(12, 13);
        // int x = add(12, 13, 14);
        int x = add(12);

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