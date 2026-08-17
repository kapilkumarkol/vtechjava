import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

class A {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(); 

        list.add(56);
        list.add(23);
        list.add(9);
        list.add(78);
        list.add(34);
        list.add(42);

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);
    }
}