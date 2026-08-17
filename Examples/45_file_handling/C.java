import java.io.File;

class A {
    public static void main(String[] args) {
        File file1 = new File("aaa");
        //folder path aaa
        
        File file2 = new File("om.txt");
        //file path om.txt
        
        // you can pass file or folder path as an argument to File constructor

        System.out.println(file1);
        System.out.println(file2);
    }
}