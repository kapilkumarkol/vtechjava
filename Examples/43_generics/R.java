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

    static void process(ArrayList<Integer> list1) {
        System.out.println(list1);
    }

    static void process(ArrayList<Float> list2) {
        System.out.println(list2);
    }
} 

// .java:25: error: name clash: process(ArrayList<Float>) and process(ArrayList<Integer>) have the same erasure
//     static void process(ArrayList<Float> list2) {
//                 ^
// 1 error