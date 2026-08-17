import java.util.HashSet;

class A {
    public static void main(String[] args) {
        HashSet<Integer> x = new HashSet<Integer>();

        x.add(12);
        x.add(67);
        x.add(23);
        x.add(89);

        for(Integer e : x) {
            System.out.println(e);
        }
    }
}