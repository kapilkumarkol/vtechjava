import java.io.File;
import java.io.IOException;

class A {
    public static void main(String[] args) throws IOException {
        File x = new File("golu.txt");

        x.createNewFile();
        //checked exception generating code
    }
}