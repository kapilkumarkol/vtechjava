import java.io.File;
import java.io.IOException;

class A {
    public static void main(String[] args) {
        
        File file = new File("himmat_singh.txt");

        File x = new File("double_himmat_singh.txt");

        file.renameTo(x);
    }
}