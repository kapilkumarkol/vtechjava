import java.util.HashMap;

class A {
    public static void main(String[] args) {
        HashMap x = new HashMap();

        System.out.println(x.put("om", "JEC"));
        System.out.println(x.put("ram", "GGITS"));
        System.out.println(x.put("mohan", "SRIT"));
        System.out.println(x.put("ajay", "Global"));
        
        System.out.println(x.put("om", "RRR"));
    }
}