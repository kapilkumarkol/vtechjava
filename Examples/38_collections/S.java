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

        for(String tmp : x) {
            System.out.println(tmp);
        }
    }
}


// S.java:14: error: incompatible types: Object cannot be converted to String
//         for(String tmp : x) {
//                          ^
// Note: S.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error