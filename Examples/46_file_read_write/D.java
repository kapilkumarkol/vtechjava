import java.io.FileWriter;
import java.io.IOException;

class A {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("dheerendra.txt");

            fw.write("mohan is a good boy.\n");
            fw.write("he is my best friend.");

            fw.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}