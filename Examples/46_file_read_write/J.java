import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;

class A {
    public static void main(String[] args) {
        File file = new File("mangu.txt");

        try {
            FileReader fr = new FileReader(file);
            
            int x = fr.read();

            while(x != -1) {
                System.out.print((char)x);

                x = fr.read();
            }

            fr.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}