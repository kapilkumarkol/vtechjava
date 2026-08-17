class A {
    static X t = new X();

    public static void main(String[] args) {
        t.pro();
    }
}

interface W {
    void pro();
}

class X implements W {
    public void pro() {
        System.out.println("Hi");
    }
}