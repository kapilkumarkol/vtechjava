import java.util.HashSet;

class A {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add(12);
        set.add(78);
        set.add(23);
        set.add(67);
        set.add(44);
        set.add(12);

        System.out.println(set);
    }
}

// Duplicate Records not allowed...