import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.File;

class A {
    public static void main(String[] args) {
        File file = new File("yam.txt");

        try {
            FileWriter fw = new FileWriter(file);

            BufferedWriter bw = new BufferedWriter(fw);

            bw.write('A');
            bw.write('m');
            bw.newLine();
            bw.write('a');
            bw.write('n');

            bw.close();
            fw.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}