class A {
    public static void main(String[] args) {
        short x = Short.parseShort("789");
        // short x = Short.parseShort("7,890"); //not ok
        // short x = Short.parseShort("32768"); //not ok
        
        System.out.println(x);
    }
}