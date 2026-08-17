class A {
    public static void main(String[] args) {
        // Long x = Long.valueOf(50000);
        // Long x = Long.valueOf("89");
        Long x = Long.valueOf("121", 2);

        System.out.println(x);
    }
}

// Exception in thread "main" java.lang.NumberFormatException: For input string: "121"