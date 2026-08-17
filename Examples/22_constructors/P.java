class A {
    A x = new A();

    public static void main(String[] args) {
        A y = new A();
    }
}


// Exception in thread "main" java.lang.StackOverflowError
//         at A.<init>(P.java:2)
//         at A.<init>(P.java:2)
//         .
//         .
//         .