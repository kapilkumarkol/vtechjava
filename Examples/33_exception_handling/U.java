import java.io.File;

class A {
    public static void main(String[] args) {
        File x = new File("golu.txt");

        try {
            x.createNewFile();
        } catch(ArithmeticException e) {
            e.printStackTrace();
        }
    }
}

// U.java:8: error: unreported exception IOException; must be caught or declared to be thrown
//             x.createNewFile();
//                            ^
// 1 error