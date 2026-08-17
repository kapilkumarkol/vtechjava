class A {
    public static void main(String[] args) {
        System.out.println(B.y);
        B.pro();
    }
}

class B {
    static int y = 900;

    static void pro() {
        System.out.println("Hello Golu Ji");
    }
}
