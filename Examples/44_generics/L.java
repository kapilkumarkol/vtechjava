import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();
        
        x.add(45);
        x.add(56);
        x.add(67);
        
        ArrayList<Float> y = new ArrayList<Float>(); 
        
        y.add(3.45f);
        y.add(5.6f);
        y.add(11.3f);
        
        ArrayList<String> z = new ArrayList<String>(); 
    
        z.add("golu");
        z.add("bholu");
        z.add("dholu");

        process(x);
        process(y);
        process(z);
    }

    static <X> void process(ArrayList<X> x) {
        for(X o : x) {
            if(o instanceof String) {
                System.out.println(((String)o).length());
            }
            System.out.println(o);
        }
        System.out.println("\n+++++++++++++++");
    }
}