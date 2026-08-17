import java.io.File;

class A {
    public static void main(String[] args) {
        File file = new File("D:\\aaa");

        String[] x = file.list();

        for(String y : x) {
            System.out.println(y + " ----");
        }
    }
}