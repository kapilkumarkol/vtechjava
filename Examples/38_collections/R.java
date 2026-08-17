import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList<String>();

        x.add("mohan");
        x.add("rohan");
        x.add("gohan");
        x.add("tohan");
        x.add("sohan");

        for(int i = 0; i < x.size(); i++) {
            System.out.println(x.get(i));
        }
    }
}