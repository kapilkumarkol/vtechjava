class A {
    static void pro(String[] a) {
        System.out.println("Hello");
    }

    static void pro(String... a) {
        System.out.println("Hello");
    }
}

// error: cannot declare both pro(String...) and pro(String[]) in A