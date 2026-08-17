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

        // System.out.println(list);

        // int val = Collections.binarySearch(list, "jay");
        // int val = Collections.binarySearch(list, "bheem");
        int val = Collections.binarySearch(list, "ekta");
    
        System.out.println(val);
    }
}