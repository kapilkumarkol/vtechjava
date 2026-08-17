import java.io.File;

class A {
    public static void main(String[] args) {
        File file1 = new File("golu.txt");
         
        System.out.println(file1.exists());
        
        file1.createNewFile();    

        System.out.println(file1.exists());
    }
}