import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add("mohani");
        x.add("rohanan");
        x.add("gohandas");
        x.add("tohansharma");
        x.add("sohanji");
        x.add("eohan");

        for(Object tmp : x) {
            String str = (String)tmp;
            System.out.println(str.length());
        }
    }
}
