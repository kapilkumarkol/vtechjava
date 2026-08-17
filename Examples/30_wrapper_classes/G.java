class A {
    public static void main(String[] args) {
        Byte x = Byte.valueOf("1a3");

        System.out.println(x);
    }
}

// Exception in thread "main" java.lang.NumberFormatException: For input string: "1a3"