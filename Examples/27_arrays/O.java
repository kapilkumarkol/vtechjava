class A {
    public static void main(String[] args) {
        int[][] x = {{23,45,12},{1,2},{11,12,13,14,15},{45,89}};

        System.out.println(x instanceof int[][]);
        System.out.println(x[0] instanceof int[]);
        // System.out.println(x[0][0] instanceof int);  // NOT OK

        System.out.println(x instanceof Object);
        System.out.println(x[0] instanceof Object);
    }
}


// O.java:7: error: unexpected type
//         System.out.println(x[0][0] instanceof int);
//                                ^
//   required: reference
//   found:    int
// O.java:7: error: unexpected type
//         System.out.println(x[0][0] instanceof int);
//                                               ^
//   required: class or array
//   found:    int
// 2 errors