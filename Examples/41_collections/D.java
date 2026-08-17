import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add(12);
        x.add(67);
        x.add(23);
        x.add(89);
        x.add(46);

        for(Object e : x) {
            System.out.println(e);
        }

        //old error code
        // for(Integer e : x) {
        //     System.out.println(e);
        // }
    }
}