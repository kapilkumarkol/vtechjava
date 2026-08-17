class A {
    public static void main(String[] args) {
        short x = 560; 
        // narrowing conversion but type-casting is exempted...
        // value must be constant and within range of short type, which is: -32768 to 32767
        short y = 'A';
        // short z = 32768;

        Short a = 6789;
                //int -> conversion -> short -> Boxing -> Short

        Short b = 'A';
        
        // Short c = 32768;
    }
}