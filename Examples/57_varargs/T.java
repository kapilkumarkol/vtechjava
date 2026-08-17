class A {
    A(char... e) {
        System.out.println(e.length);
    }

    public static void main(String[] args) {
        A x = new A('A', 'w', '1', '%', '\n', ' ');
    }
}