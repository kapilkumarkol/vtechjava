class A {
    public static void main(String[] args) {

        // Byte x = Byte.valueOf(34); 
        // error: no suitable method found for valueOf(int)

        Byte x = Byte.valueOf((byte)34); 

        System.out.println(x);
    }
}