import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;

class A {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("jaggu.txt")));

            String str = null;
            while((str = br.readLine()) != null) {
                System.out.println(str + " ~~~~~");
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}