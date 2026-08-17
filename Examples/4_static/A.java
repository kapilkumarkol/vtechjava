class Circle {
    int radius;

    float pi = 3.14f;

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 23;
        c1.pi = 2.34f;

        Circle c2 = new Circle();
        c2.radius = 34;
        c2.pi = 7.67f;

        System.out.println(c1.pi);
        System.out.println(c2.pi);
    }
}