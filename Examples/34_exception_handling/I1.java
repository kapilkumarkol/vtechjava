class A {
    public static void main(String[] args) {
        int x = pro();

        System.out.println(x);
    }

    static int pro() {
        try {
            return 34;
        } catch(ArithmeticException e) {
         
        }
    }
}

// I1.java:14: error: missing return statement
//     }
//     ^
// 1 error