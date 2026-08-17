class Circle {
    static int radius;

    static float pi = 3.14f;

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 23;

        Circle c2 = new Circle();
        c2.radius = 34;

        System.out.println(c1.radius);
        System.out.println(c2.radius);
    }
}