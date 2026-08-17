import java.io.File;
import java.io.IOException;

class A {
    public static void main(String[] args) throws IOException {
        File file1 = new File("vinod.txt");
         
        System.out.println(file1.exists());
        
        System.out.println(file1.createNewFile());            

        System.out.println(file1.exists());
    }
}