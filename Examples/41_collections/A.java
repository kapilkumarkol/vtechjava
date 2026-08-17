import java.util.HashMap;
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

        Set set = x.keySet();
        
        System.out.println(set);
    }
}