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

        Iterator itr = set.iterator();
        
        while(itr.hasNext()) {
            Integer x = itr.next();
            System.out.println(x);
        }
    }
}


// O.java:17: error: incompatible types: Object cannot be converted to Integer
//             Integer x = itr.next();
//                                 ^
// 1 error