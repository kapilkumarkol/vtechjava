import java.io.File;
import java.io.IOException;

class A {
    public static void main(String[] args) {
        
        File file = new File("aaa/yyy");
        System.out.println(file.mkdirs());

        File fl = new File(file, "mohan.txt");

        try {
            fl.createNewFile();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}