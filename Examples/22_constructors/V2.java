class A {
    static final int u;

    A() {
        u = 90;
    }

    public static void main(String[] args) {
        System.out.println(u);
    }
}

// V2.java:5: error: cannot assign a value to final variable u
//         u = 90;
//         ^
// 1 error