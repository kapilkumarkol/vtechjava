import java.io.File;
import java.io.IOException;

class A {
    public static void main(String[] args) {
        //Case 1:
        // File file = new File("yamraj\\chitragupta\\mohan.txt");
        // System.out.println(file.mkdirs());

        //Case 2:
        
        File file = new File("yamraj\\chitragupta");
        System.out.println(file.mkdirs());

        File fl = new File("yamraj/chitragupta/mohan.txt");

        try {
            fl.createNewFile();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}