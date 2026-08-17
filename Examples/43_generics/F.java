import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<Boolean> x = new ArrayList<Boolean>();

        x.add(true);
        x.add(12);
        x.add(2.34);

       System.out.println(x);
    }
}


// F.java:8: error: incompatible types: int cannot be converted to Boolean
//         x.add(12);
//               ^
// F.java:9: error: incompatible types: double cannot be converted to Boolean
//         x.add(2.34);
//               ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 2 errors