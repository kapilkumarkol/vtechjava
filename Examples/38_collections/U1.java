import java.util.ArrayList;
import java.util.Iterator;

class A {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add(45);
        x.add(67);
        x.add(23);
        x.add(34);
        x.add(12);

        Iterator itr = x.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
