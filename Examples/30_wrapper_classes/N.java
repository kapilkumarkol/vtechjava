class A {
    public static void main(String[] args) {
        Short s = Short.valueOf("59");
        
        // Short s = Short.valueOf("5,934");
        // Exception in thread "main" java.lang.NumberFormatException: For input string: "5,934"
        
        // Short s = Short.valueOf("40000");    

        System.out.println(s);
    }
}