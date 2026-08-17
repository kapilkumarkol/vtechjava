class Shape {
    int length;
    int width;
    int height;

    Shape(int length) {
        this.length = length;
    }

    Shape(int length, int width) {
        this.length = length;
        this.width = width;
    }

    Shape(int length, int width, int height) {
        this(length, width);
        // this.length = length;
        // this.width = width;
        this.height = height;
    }
}

class A {
    public static void main(String[] args) {
        Shape z = new Shape(23, 56, 34);

        System.out.println(z.length + " - " + z.width + " - " + z.height);
    }
}