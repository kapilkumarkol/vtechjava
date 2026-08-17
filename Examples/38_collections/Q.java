import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList<String>();

        x.add("mohan");
        x.add(45);
        x.add(true);
        x.add(5.6);
        x.add('E');        
    }
}


// Q.java:8: error: incompatible types: int cannot be converted to String
//         x.add(45);
//               ^
// Q.java:9: error: incompatible types: boolean cannot be converted to String
//         x.add(true);
//               ^
// Q.java:10: error: incompatible types: double cannot be converted to String
//         x.add(5.6);
//               ^
// Q.java:11: error: incompatible types: char cannot be converted to String
//         x.add('E');
//               ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 4 errors