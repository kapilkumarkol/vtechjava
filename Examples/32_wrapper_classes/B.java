class A {
    public static void main(String[] args) {
        // byte x = Byte.parseByte("45");
        
        // byte x = Byte.parseByte("128");
        // Exception in thread "main" java.lang.NumberFormatException: Value out of range. Value:"128" Radix:10
        
        byte x = Byte.parseByte("4a5");
        // Exception in thread "main" java.lang.NumberFormatException: For input string: "4a5"
        

        System.out.println(x);
    }
}