import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class A {
    public static void main(String[] args) {
        Employee emp = new Employee(
                                    "raghav", 
                                    21, 
                                    new MyAddress("jabalpur", "MP")
                                );

        try {
            FileOutputStream fos = new FileOutputStream("tmp.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(emp);

            oos.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}