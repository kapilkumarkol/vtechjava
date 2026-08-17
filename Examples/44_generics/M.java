import java.util.ArrayList;

class A {

    A(ArrayList x) {
        for(Object t : x) {
            System.out.println(t);
        }

        System.out.println("\n~~~~~~~~~~~");
    }
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();
        
        x.add(45);
        x.add(56);
        x.add(67);
        x.add(99);
        
        ArrayList<Float> y = new ArrayList<Float>(); 
        
        y.add(3.45f);
        y.add(5.6f);
        y.add(11.3f);
        y.add(0.99f);
        
        ArrayList<String> z = new ArrayList<String>(); 
    
        z.add("golu");
        z.add("bholu");
        z.add("dholu");
        z.add("aaaa");

        new A(x);
        new A(y);
        new A(z);
    }

    
}