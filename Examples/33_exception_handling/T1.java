import java.io.File;
import java.io.IOException;

class A {
    public static void main(String[] args) {
        File x = new File("golu.txt");

        try {
            boolean t = x.createNewFile();
            System.out.println(t);
            //checked exception generating code
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}