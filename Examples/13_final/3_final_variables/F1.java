class A {
    public static void main(String[] args) {        
        final int t;  //uninitialized variable

        t = 56;

        t = 78;

        System.out.println(t);
    }
}

/*
F1.java:7: error: variable t might already have been assigned
        t = 78;
 */