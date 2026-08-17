import java.util.TreeSet;

class A {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(89);
        set.add(13);
        set.add(56);
        set.add(23);
        set.add(4);
        set.add(67);
        set.add(89);

        System.out.println(set);
        // System.out.println(set.remove(56));
        System.out.println(set.contains(56));
        System.out.println(set);
    }
}