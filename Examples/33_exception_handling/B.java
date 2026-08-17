class A {
    public static void main(String[] args) {
        System.out.println(1);

        String str = null;
        System.out.println(str.length());

        System.out.println(2);
    }
}

// Exception in thread "main" java.lang.NullPointerException
//         at A.main(B.java:6)