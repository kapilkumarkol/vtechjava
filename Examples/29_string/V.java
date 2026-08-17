class A {
    public static void main(String[] args) {
        String x = "mohan is a good boy";

        String y = x.toUpperCase().replace("GOOD", "BAD").substring(11);

        System.out.println(y);
    }
}