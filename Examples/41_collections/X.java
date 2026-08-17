import java.util.TreeMap;

class A {
    public static void main(String[] args) {
        TreeMap<String,Integer> map = new TreeMap<>();

        map.put("umesh", 12);
        map.put("om", 17);
        map.put("yam", 8);
        map.put("ram", 10);
        map.put("jitendra", 15);
        map.put("mohan", 4);

        
 
        // System.out.println(map.headMap("om"));
        System.out.println(map.headMap("om", true));
    }
}