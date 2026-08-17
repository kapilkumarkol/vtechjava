import java.util.HashMap;

class A {
    public static void main(String[] args) {
        HashMap x = new HashMap();

        x.put("om", "JEC");
        x.put("ram", "GGITS");
        x.put("mohan", "SRIT");
        x.put("ajay", "Global");
        
        System.out.println(x);

        x.put("om", "LNCT");
        //duplicate keys not allowed

        System.out.println(x);
    }
}