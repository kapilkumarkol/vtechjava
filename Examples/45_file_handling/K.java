import java.io.File;

class A {
    public static void main(String[] args) {
        File file = new File("golu.txt");

        // System.out.println(file.exists()); 
        System.out.println(file.isDirectory()); 
        System.out.println(file.isFile()); 
    }
}