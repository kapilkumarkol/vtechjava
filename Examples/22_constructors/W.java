class X {
    X(int q) {
        System.out.println(q);
    }
}

class A extends X {
    int y = 2;

    A() {
        super(y);
    }

    public static void main(String[] args) {
        A a = new A();
    }
}

// W.java:11: error: cannot reference y before supertype constructor has been called
//         super(y);
//               ^
// 1 error