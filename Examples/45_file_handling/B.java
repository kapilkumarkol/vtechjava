import java.io.File;

class A {
    public static void main(String[] args) {
        File file = new File("mohan.txt");
        //mohan.txt file is expected in current directory: 45_file_handling
        //create one if does not exist and try again

        System.out.println(file.exists());
    }
}