class A {
    public static void main(String[] args) {
        // byte b = 23;
        byte b = (byte)128;
        
        Byte x = Byte.valueOf(b);
        Byte y = Byte.valueOf(b);

        Byte g = b;
        Byte h = b;

        System.out.println(x == y);
        System.out.println(g == y);
        System.out.println(g == h);

        System.out.println(x);
        System.out.println(y);
        System.out.println(g);
        System.out.println(h);
    }
}