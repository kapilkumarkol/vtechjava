class A { 
    static private int r = 55;

    static class B {
        static void info() {  //OK
            System.out.println(r);
        }
    }

    public static void main(String[] args) {
        B.info();
    }
}