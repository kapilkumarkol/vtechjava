import java.util.LinkedHashSet;
import java.util.HashSet;

class A {
    public static void main(String[] args) {
        LinkedHashSet x = new LinkedHashSet();
        // HashSet x = new HashSet();

        x.add(78);
        x.add(8);
        x.add(34);
        x.add(59);
        x.add(23);

        System.out.println(x);
    }
}