import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(12);
        list.add(13);
        list.add(45);
        list.add(2);
        list.add(21);
        list.add(34);

        System.out.println(list.size());
        System.out.println(list.isEmpty());
    }
}