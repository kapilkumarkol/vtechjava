import java.util.ArrayList;
import java.util.Iterator;

class A {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add("ram");
        x.add("vishwamitra");
        x.add("mohan");
        x.add("om");
        x.add("jagdeesh");

        Iterator itr = x.iterator();

        while(itr.hasNext()) {
            String str = (String)itr.next();
            System.out.println(str.length());
        }
    }
}
