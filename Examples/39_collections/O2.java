import java.util.HashSet;
import java.util.Iterator;

class A {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();

        set.add(12);
        set.add(78);
        set.add(23);
        set.add(67);
        set.add(44);

        Iterator<Integer> itr = set.iterator();
        
        while(itr.hasNext()) {
            Integer x = itr.next();
            System.out.println(x);
        }

        System.out.println(set);
    }
}