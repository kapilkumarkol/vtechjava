import java.io.File;
import java.io.IOException;

class A {
    public static void main(String[] args) {
        
        File file = new File("aaa/bbb/golu.txt");

        File x = new File("D:\\aaa\\bbb\\vibhore.txt");

        file.renameTo(x);
    }
}