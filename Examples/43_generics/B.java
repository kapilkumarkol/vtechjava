import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        
        ArrayList<int> x = new ArrayList<int>();

        System.out.println(x);
    }
}


// B.java:6: error: unexpected type
//         ArrayList<int> x = new ArrayList<int>();
//                   ^
//   required: reference
//   found:    int
// B.java:6: error: unexpected type
//         ArrayList<int> x = new ArrayList<int>();
//                                          ^
//   required: reference
//   found:    int
// 2 errors