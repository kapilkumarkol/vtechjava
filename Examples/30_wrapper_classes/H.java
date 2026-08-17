class A {
    public static void main(String[] args) {
        // Byte x = Byte.valueOf("128");  //NOT OK
        
        Byte x = Byte.valueOf("127");  //OK
    }
}

// Exception in thread "main" java.lang.NumberFormatException: Value out of range. Value:"128" Radix:10