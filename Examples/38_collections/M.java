import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(5);
        list.add(2);
        list.add(7);
        list.add(9);
        list.add(4);

        System.out.println(list);

        System.out.println(list.get(2));

        System.out.println(list);
    }
}