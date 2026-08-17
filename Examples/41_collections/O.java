import java.util.TreeSet;

class A {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        
        set.add(45);
        set.add(89);
        set.add(12);
        set.add(32);
        set.add(9);
        set.add(23);

        System.out.println(set);
        System.out.println(set.first());
        System.out.println(set.last());
    }
}