import java.util.HashSet;

class A {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("mohan");
        set.add("rohan");
        set.add("sohan");
        set.add("tohan");
        set.add("gohan");
        set.add("mohan");
        set.add("sohan");

        System.out.println(set);
    }
}

// Duplicate Records not allowed...