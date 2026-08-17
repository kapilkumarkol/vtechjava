import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class A {
    public static void main(String[] args) throws IOException {
        Student s = new Student();
        s.name = "golu";
        s.age = 21;
        s.college = "SRIT";
        s.marks = 78.5f;

        new ObjectOutputStream(new FileOutputStream("monu.txt")).writeObject(s);
    }    
}
