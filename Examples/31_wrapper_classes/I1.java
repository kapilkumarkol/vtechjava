class A {
    public static void main(String[] args) {
        char w = 4000;
        // char w = 127;

        Character a = Character.valueOf(w);
        Character b = Character.valueOf(w);

        Character x = w;
        Character y = w;

        System.out.println(a == b);
        System.out.println(a == x);
        System.out.println(y == x);

    }
}