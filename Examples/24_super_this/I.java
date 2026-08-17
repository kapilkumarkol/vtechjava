class A {
    static {
        System.out.println(this);
    }

    {
        System.out.println(this);
    }
}


// I.java:3: error: non-static variable this cannot be referenced from a static context
//         System.out.println(this);
//                            ^
// 1 error