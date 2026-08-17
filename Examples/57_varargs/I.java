class A {
    public static void main(String[] args) {
        char c = 'A';
        byte b = 23;
        short s = 345;
        int i = 56000;
        long l = 456789958L;

        pro(c, b, s, i, l);
    }

    static void pro(int... x) {
        System.out.println(x.length);

        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[3]);
    }
}

// I.java:9: error: method pro in class A cannot be applied to given types;
//         pro(c, b, s, i, l);
//         ^
//   required: int[]
//   found: char,byte,short,int,long
//   reason: varargs mismatch; possible lossy conversion from long to int
// 1 error