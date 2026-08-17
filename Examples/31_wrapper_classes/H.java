class A {
    public static void main(String[] args) {
        Boolean a = Boolean.valueOf(true);
        Boolean b = Boolean.valueOf(true);

        Boolean x = true;
        Boolean y = true;

        System.out.println(a == b);
        System.out.println(x == y);
        System.out.println(a == y);
    }
}