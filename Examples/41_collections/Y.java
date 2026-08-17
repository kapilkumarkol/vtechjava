import java.util.TreeMap;
import java.util.Map;

class A {
    public static void main(String[] args) {
        TreeMap<String,Integer> map = new TreeMap<>();

        map.put("umesh", 12);
        map.put("om", 17);
        map.put("yam", 8);
        map.put("ram", 10);
        map.put("jitendra", 15);
        map.put("mohan", 4);

        Map.Entry<String,Integer> entry = map.ceilingEntry("prakash");
        // System.out.println(entry);
        System.out.println(entry.getKey());
        System.out.println(entry.getValue());
    }
}