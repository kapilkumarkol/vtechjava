class A {
    public static void main(String[] args) {
        System.out.println("start");
        try {
            System.out.println("A");
        } finally {
            System.out.println("B");
        }
        System.out.println("end");
    }
}