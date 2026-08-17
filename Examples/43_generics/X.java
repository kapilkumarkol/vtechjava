import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(12);
        x.add(56);
        x.add(89);

        process(x);
    }

    static void process(ArrayList<? extends Number> y) {
        //Case 4:
        // y.set(1, 23);
        // error: incompatible types
        
        //Case 3:
        // Number num = y.remove(1);
        // System.out.println(num);  

        //Case 2:
        // Number num = y.get(0);
        // System.out.println(num);        
        
        //Case 1:
        // y.add(23);
        // error: incompatible types:
    }
} 