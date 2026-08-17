class A {
    public static void main(String[] args) {
        System.out.println(1);

        int[] x = {12, 13};
        System.out.println(x[2]);

        System.out.println(2);
    }
}


// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
//         at A.main(C.java:6)