import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

class B {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("megh.txt"));
        
            Student x = (Student)ois.readObject();
            Student y = (Student)ois.readObject();
            Student z = (Student)ois.readObject();

            System.out.println(x);
            System.out.println(y);
            System.out.println(z);

            ois.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
    }    
}
