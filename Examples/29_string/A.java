class A {
    public static void main(String[] args) {
        String a = "mohan";
        String b = "  mohan   ";

        String c = b.trim();

        System.out.println(c == a);
        System.out.println(a);
        System.out.println(c);
    }

}