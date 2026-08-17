import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

class A {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(); 

        list.add("rohan");
        list.add("ekta");
        list.add("tikku");
        list.add("jay");
        list.add("bheem");
        list.add("raju");

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);
    }
}