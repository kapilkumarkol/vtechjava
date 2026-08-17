import java.io.File;

class A {
    public static void main(String[] args) {
        File file = new File("aaa/bbb");

        String absolutePath = file.getAbsolutePath();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(absolutePath);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}