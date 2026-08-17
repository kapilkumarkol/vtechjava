class A {
    public static void main(String[] args) {
        System.out.println("start");
        try {
            System.out.println("1");
            int y = 23/0;
            System.out.println("2");
        } finally {
            System.out.println("B");
        }
        System.out.println("end");
    }
}