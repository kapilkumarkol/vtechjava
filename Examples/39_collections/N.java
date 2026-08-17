import java.util.HashSet;

class A {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();

        set.add(12);
        set.add(78);
        set.add(23);
        set.add(67);
        set.add(44);

        System.out.println(set);
        System.out.println(set.contains(44));
        System.out.println(set);
    }
}

// Duplicate Records not allowed...