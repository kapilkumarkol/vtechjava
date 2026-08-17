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

        Collections.sort(list);
        
        // int val = Collections.binarySearch(list, "hemant");
        // int val = Collections.binarySearch(list, "rajan");
        // int val = Collections.binarySearch(list, "aman");
        // int val = Collections.binarySearch(list, "yam");
        int val = Collections.binarySearch(list, "yam");
    
        System.out.println(val);
    }
}