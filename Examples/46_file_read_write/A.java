import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class A {
    public static void main(String[] args) {
        File file = new File("java.txt");

        try {
            file.createNewFile();

            FileWriter fw = new FileWriter(file);

            fw.write('m');
            fw.write('o');
            fw.write('h');
            fw.write(97);
            fw.write('n');

            fw.flush();
            fw.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}