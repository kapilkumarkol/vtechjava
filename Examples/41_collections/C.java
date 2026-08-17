import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class A {
    public static void main(String[] args) {
        HashMap x = new HashMap();

        x.put("om", "JEC");
        x.put("ram", "GGITS");
        x.put("mohan", "SRIT");
        x.put("ajay", "Global");
        x.put("yam", "LNCT");
        x.put("tilak", "TS");

        for(Object o : x) {
            System.out.println(o);
        }
    }
}