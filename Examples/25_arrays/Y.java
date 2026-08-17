class A {
    public static void main(String[] args) {
        int[] x = new int[3];

        System.out.println(x[-1]);
    }
}

// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 3
//         at A.main(Y.java:5)

