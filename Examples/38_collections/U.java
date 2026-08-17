import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add(45);
        x.add(67);
        x.add(23);
        x.add(34);
        x.add(12);

        System.out.println(x.get(100));
    }
}

// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 100 out of bounds for length 5