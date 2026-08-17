import java.io.File;

class A {
    public static void main(String[] args) {
        File file1 = new File("D://aaa");
        //path of a folder aaa is an absolute path
        
        File file2 = new File("aaa");
        //path of folder aaa is a relative path
        

        System.out.println(file1);
        System.out.println(file2);
    }
}