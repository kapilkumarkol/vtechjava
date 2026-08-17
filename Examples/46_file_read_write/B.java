import java.io.FileWriter;
import java.io.IOException;

class A {
    public static void main(String[] args) {
        char[] arr = {'A', 'n', 'a', 'y'};

        try {
            FileWriter fw = new FileWriter("golu.txt");

            fw.write(arr);

            fw.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}