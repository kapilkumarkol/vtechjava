class A {
    public static void main(String[] args) {
        try {
            Class x = Class.forName("A");

            System.out.println(x);
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}