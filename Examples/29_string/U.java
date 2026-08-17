class A {
    public static void main(String[] args) {
        String str = "aE3 \n\u231a";     // valid characters wrapped in a string
        String str = "aE3 \n\u231a\N";   // \N is an invalid character
    }
}