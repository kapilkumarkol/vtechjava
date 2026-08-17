import java.io.File;

class A {
    public static void main(String[] args) {
        File f = new File("javaprac");

        System.out.println(f.exists());

        System.out.println(f.delete());

        System.out.println(f.exists());
    }
}