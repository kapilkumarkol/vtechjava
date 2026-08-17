import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

class A {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("jaggu.txt");

            char[] arr = new char[4];

            fr.read(arr);

            for(char t : arr) {
                System.out.print(t);
            }
            System.out.print(" - ");

            fr.read(arr);

            for(char t : arr) {
                System.out.print(t);
            }
            System.out.print(" - ");

            fr.read(arr);

            for(char t : arr) {
                System.out.print(t);
            }
            System.out.print(" - ");

            fr.read(arr);

            for(char t : arr) {
                System.out.print(t);
            }
            System.out.print(" - ");

            fr.read(arr);

            for(char t : arr) {
                System.out.print(t);
            }
            System.out.print(" - ");

            fr.read(arr);

            for(char t : arr) {
                System.out.print(t);
            }
            System.out.print(" - ");
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}