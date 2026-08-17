class A {
    public static void main(String[] args) {
        int a=5, b=4;

        //-----
        int c = a;
        a = b;
        b = c;
        //-----

        System.out.print(a);
        System.out.print(" ");
        System.out.print(b);
    }
}