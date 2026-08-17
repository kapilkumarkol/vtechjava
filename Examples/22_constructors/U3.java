class A {
    final int y;

    A() {
        y = 80;
    }

    A(int a) {

    }

    public static void main(String[] args) {
        A a = new A();

        System.out.println(a.y);
    }
}

// U3.java:10: error: variable y might not have been initialized
//     }
//     ^
// 1 error