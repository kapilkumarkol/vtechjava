class A {
    public static void main(String[] args) {
        System.out.println(B.y);
        B.pro();
    }
}

class B {
    int y = 90;

    void pro() {
        System.out.println("Hello Ji");
    }
}
