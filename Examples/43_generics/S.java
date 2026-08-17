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
        info(y);
    }

    static void process(ArrayList<Integer> list1) {
        for(Integer i : list1) {
            System.out.println(i);
        }
    }

    static void info(ArrayList<Float> list2) {
        for(Float i : list2) {
            System.out.println(i);
        }
    }
} 