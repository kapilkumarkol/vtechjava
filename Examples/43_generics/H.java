import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        
        ArrayList<Integer> x = new ArrayList<Integer>();
        
        x.add(12);
        x.add(13);
        x.add(14);
        x.add(15);

        process(x);
    }

    static void process(ArrayList list) {
        System.out.println(list);
    }
}
