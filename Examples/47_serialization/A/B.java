import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class A {
    public static void main(String[] args) {
        File file = new File("abc.txt");
        
        try {
            FileInputStream fis = new FileInputStream(file);

            ObjectInputStream ois = new ObjectInputStream(fis);

            Shape shape = (Shape)ois.readObject();

            System.out.println(shape.length);
            System.out.println(shape.width);
            System.out.println(shape.height);

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