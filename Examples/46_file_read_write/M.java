import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

class A {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("jaggu.txt");

            char[] arr = new char[4];

            int n = 0;
            while((n = fr.read(arr)) != -1) {
                for(char t : arr) {
                    System.out.print(t);
                }
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}