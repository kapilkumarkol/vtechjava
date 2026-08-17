import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class A {
    public static void main(String[] args) {
        Student s = new Student("tiket", 21);
        Employee e = new Employee("vijay", 21000);

        try {
            FileOutputStream fos = new FileOutputStream("sumit.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(s);
            oos.writeObject(e);

            oos.close();
        } catch(IOException e1) {
            e1.printStackTrace();
        } 
    }
}