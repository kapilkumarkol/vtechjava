final class A {
    int y = 90;
}

class B {
    public static void main(String[] args) {
        A x = new A();

        x.y = 78;

        System.out.println(x.y);
    }
}