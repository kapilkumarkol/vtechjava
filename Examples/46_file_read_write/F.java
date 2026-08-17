import java.io.PrintWriter;
import java.io.FileNotFoundException;

class A {
    public static void main(String[] args) {
        PrintWriter pw = null;

        try {
            pw = new PrintWriter("monu.txt");
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }

        pw.write("mohan is a good boy.\n");

        pw.println("he is my best friend.");

        String name = "Amrit Singh";
        int age = 9;
        float marks = 89.45f;

        pw.printf("My Name: %s and Age: %d and Marks: %.2f", name, age, marks);

        pw.close();
    }
}