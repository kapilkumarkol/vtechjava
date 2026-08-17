import java.util.HashSet;

class A {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("mohan");
        set.add("rohan");
        set.add("sohan");
        set.add("tohan");
        set.add("gohan");

        System.out.println(set.isEmpty());
        System.out.println(set.size());
        System.out.println(set);
    }
}