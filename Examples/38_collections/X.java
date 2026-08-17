import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add(11);
        x.add(12);
        x.add(13);
        x.add(14);
        x.add(15);

        int len = x.size();
        for(int i=0; i < len; i++) {
            System.out.println(x.remove(i));
        }

        System.out.println(x);
    }
}


// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 2