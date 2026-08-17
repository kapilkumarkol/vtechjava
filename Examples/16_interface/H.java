interface X {

}

class A {
    public static void main(String[] args) {
        X a = new X();

        System.out.println(a);
    }
}

// error: X is abstract; cannot be instantiated