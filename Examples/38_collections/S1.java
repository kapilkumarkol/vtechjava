import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add("mohan");
        x.add("rohan");
        x.add("gohan");
        x.add("tohan");
        x.add("sohan");
        x.add("eohan");

        for(Object tmp : x) {
            System.out.println(tmp);
        }
    }
}
