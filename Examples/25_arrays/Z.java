class A {
    int[] x;

    public static void main(String[] args) {
        System.out.println(x.length);
    }
}

// Z.java:5: error: non-static variable x cannot be referenced from a static context
//         System.out.println(x.length);
//                            ^
// 1 error