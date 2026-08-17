import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add("mohan");
        x.add(45);
        x.add(true);
        x.add(5.6);
        x.add('E');

        System.out.println(x);
    }
}

// ArrayList allows heterogeneous records...