class A {
    // static int[] pro() {
    //     int[] x = {12, 34, 56};

    //     return x;
    // }


    //NOT OK
    static int... pro() {
        int[] x = {12, 34, 56};

        return x;
    }
}