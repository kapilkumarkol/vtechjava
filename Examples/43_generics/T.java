import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<? extends Number> x1 = new ArrayList<Integer>();
        ArrayList<? extends Number> x2 = new ArrayList<Short>();
        ArrayList<? extends Number> x3 = new ArrayList<Byte>();
        ArrayList<? extends Number> x4 = new ArrayList<Long>();
        ArrayList<? extends Number> x5 = new ArrayList<Float>();
        ArrayList<? extends Number> x6 = new ArrayList<Double>();
    }
}