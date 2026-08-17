import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(23);
        list.add(56);
        list.add(37);
        list.add(23);
        list.add(3);

        System.out.println(list);

        Integer i = 23;
        System.out.println(list.remove(i));

        System.out.println(list);
    }
}