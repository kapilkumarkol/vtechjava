class A {
    public static void main(String[] args) {
        // pro("om", 78, 89, 92);
        // pro(78, 89, 92);
        // pro("golu");
        pro();
    }

    static void pro(String name, int... marks) {
        System.out.println(name);

        System.out.println(marks.length);

        for(int mark : marks) {
            System.out.println(mark+" ---");
        }
    }
}

// not ok