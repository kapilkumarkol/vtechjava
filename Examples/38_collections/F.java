import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        
        list.add(56);
        list.add(34);
        list.add(23);
        list.add(2);
        list.add(76);
        list.add(99);

        System.out.println(list);

        list.remove(2);

        System.out.println(list);
    }
}