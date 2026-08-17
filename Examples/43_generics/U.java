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

    static void process(ArrayList<? extends Number> list1) {
        for(Number i : list1) {
            System.out.println(i);
        }
    }
} 