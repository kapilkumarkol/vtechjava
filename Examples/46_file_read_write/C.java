import java.io.FileWriter;
import java.io.IOException;

class A {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("mahendra.txt");

            fw.write(args[0]);

            fw.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}