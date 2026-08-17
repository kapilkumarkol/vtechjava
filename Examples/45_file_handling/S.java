import java.io.File;

class A {
    public static void main(String[] args) {
        File file = new File("aaa/bbb");

        File absoluteFilePath = file.getAbsoluteFile();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(absoluteFilePath);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}