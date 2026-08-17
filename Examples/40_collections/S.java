import java.util.HashMap;

class A {
    public static void main(String[] args) {
        HashMap x = new HashMap();

        x.put("om", "JEC");
        x.put("ram", null);
        x.put("mohan", null);
        x.put("ajay", "Global");
        x.put(null, "LNCT");
        
        //duplicate values allowed

        System.out.println(x);
    }
}