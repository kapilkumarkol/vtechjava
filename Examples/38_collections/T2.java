import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList<String>();

        x.add("mohani");
        x.add("rohanan");
        x.add("gohandas");
        x.add("tohansharma");
        x.add("sohanji");
        x.add("eohan");

        for(String tmp : x) {
            System.out.println(tmp.length());
        }
    }
}
