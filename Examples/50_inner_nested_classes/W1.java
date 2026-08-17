class A { 
    private int r = 55;

    static class B {
        static void info() {  //OK
            System.out.println(r);
        }
    }

    public static void main(String[] args) {
        B.info();
    }
}

// error: non-static variable r cannot be referenced from a static context