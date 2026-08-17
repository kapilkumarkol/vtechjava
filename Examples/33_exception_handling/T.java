import java.io.File;

class A {
    public static void main(String[] args) {
        File x = new File("golu.txt");

        x.createNewFile();
        //checked exception generating code
    }
}

// T.java:7: error: unreported exception IOException; must be caught or declared to be thrown
//         x.createNewFile();
//                        ^
// 1 error