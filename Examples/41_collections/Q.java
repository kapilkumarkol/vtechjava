import java.util.TreeSet;
import java.util.Set;

class A {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        
        set.add(45);
        set.add(89);
        set.add(12);
        set.add(78);
        set.add(32);
        set.add(9);
        set.add(53);
        set.add(23);

        // Set x = set.tailSet(60);
        // Set x = set.tailSet(100);
        Set x = set.tailSet(53);

        System.out.println(x);
    }
}