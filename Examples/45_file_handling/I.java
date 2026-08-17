import java.io.File;

class A {
    public static void main(String[] args) {
        File file = new File("aaa/bbb/ccc");

        System.out.println(file.mkdir()); 
    }
}