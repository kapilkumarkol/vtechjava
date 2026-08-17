import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList<String>();

        x.add("mohan");
        x.add("rohan");
        x.add("gohan");
        x.add("tohan");
        x.add("sohan");

        String str = x.get(0);

        System.out.println(str);
    }
}