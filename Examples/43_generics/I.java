import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(true);
        list.add(12);
        list.add("monu");
        list.add(2.34);

        process(list);
    }

    static void process(ArrayList<Integer> x) {
        x.add(67);
        x.add(54);

        System.out.println(x);
    }
}