abstract class X {
    void pro() {
        System.out.println("Golu");
    }
}

class A extends X {
    public static void main(String[] args) {
        A a = new A();

        a.pro();
    }
}