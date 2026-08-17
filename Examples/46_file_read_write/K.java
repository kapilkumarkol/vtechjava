import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;

class A {
    public static void main(String[] args) {
        File file = new File("jaggu.txt");

        try {
            FileReader fr = new FileReader(file);
            
            
            int x = 0;
            while((x = fr.read()) != -1) {
                System.out.print((char)x);                
            }

            fr.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}