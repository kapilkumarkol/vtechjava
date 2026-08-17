import java.io.File;
import java.io.IOException;

class A {
    public static void main(String[] args) {
        File file1 = new File("golu.txt");
         
        System.out.println(file1.exists());
        
        try {
            System.out.println(file1.createNewFile());    
        } catch(IOException e) {
            e.printStackTrace();
        }

        System.out.println(file1.exists());
    }
}