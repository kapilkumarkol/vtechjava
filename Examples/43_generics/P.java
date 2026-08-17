import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(12);
        x.add(56);
        x.add(89);

        ArrayList<Float> y = new ArrayList<Float>();

        y.add(3.4f);
        y.add(.56f);
        y.add(12.4f);
        
        process(x);
        process(y);
    }

    static void process(ArrayList<Integer> list) {
        System.out.println(list);
    }
}

// P.java:18: error: incompatible types: ArrayList<Float> cannot be converted to ArrayList<Integer>
//         process(y);