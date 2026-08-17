package b;

import a.A;

class B {

    public static void main(String[] args) {
        System.out.println(A.y);

        // A.y = 56;
        // error: cannot assign a value to final variable y
    }
}

