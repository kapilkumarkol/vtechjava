class X {
    private X() {

    }
}

class A {
    public static void main(String[] args) {
        X y = new X();
    }
}

// T.java:9: error: X() has private access in X
//         X y = new X();
//               ^
// 1 error