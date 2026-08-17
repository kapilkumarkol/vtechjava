import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add(11);
        x.add(12);
        x.add(13);
        x.add(14);
        x.add(15);

        
        for(int i=0; i < x.size(); i++) {
            System.out.println(x.remove(0));
        }

        System.out.println(x);
    }
}

