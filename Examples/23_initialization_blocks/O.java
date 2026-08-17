class A {
    static {
        System.out.println("Hello Duniya walo...");

        int y = 12 / 0;
    }

    public static void main(String[] args) {
        System.out.println("Hi");
    }
}


// Exception in thread "main" java.lang.ExceptionInInitializerError
// Caused by: java.lang.ArithmeticException: / by zero
//         at A.<clinit>(O.java:5)