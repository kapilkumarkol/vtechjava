import java.io.File;

class A {
    public static void main(String[] args) {
        File file = new File("D:\\aaa\\bbb");

        System.out.println(file.mkdirs());
    }
}