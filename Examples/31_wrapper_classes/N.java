class A {
    public static void main(String[] args) {
        float s = 3.4f;

        Float x = Float.valueOf(s);
        Float y = Float.valueOf(s);

        Float a = s;
        Float b = s;

        System.out.println(x == y);
        System.out.println(a == y);
        System.out.println(a == b);
    }
}