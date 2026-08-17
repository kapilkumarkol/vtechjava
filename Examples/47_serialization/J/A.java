import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class A {
    public static void main(String[] args) {
        Student s1 = new Student("om", 12);
        Student s2 = new Student("ram", 21);
        Student s3 = new Student("golu", 9);

        try {
            FileOutputStream fos = new FileOutputStream("megh.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(s1);
            oos.writeObject(s2);
            oos.writeObject(s3);

            oos.close();
        } catch(IOException e) {
            e.printStackTrace();
        } 
    }
}