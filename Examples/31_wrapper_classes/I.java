class A {
    public static void main(String[] args) {
        Character a = Character.valueOf('A');
        Character b = Character.valueOf('A');

        Character x = 'A';
        Character y = 'A';

        System.out.println(a == b);
        System.out.println(a == x);
        System.out.println(y == x);
    }
}