import java.util.LinkedHashMap;
import java.util.HashMap;

class A {
    public static void main(String[] args) {
        // HashMap<String, Integer> map = new HashMap<String, Integer>();
        LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();

        map.put("om", 12);
        map.put("yam", 21);
        map.put("ram", 18);
        map.put("golu", 8);
        map.put("umesh", 15);

        System.out.println(map);
    }
}