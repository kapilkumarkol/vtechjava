import java.io.FileOutputStream;
import java.io.File;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

import java.io.Serializable;

class A {
    public static void main(String[] args) {
        Shape shape = new Shape(11, 9, 21);

        File file = new File("abc.txt");
        
        try {
            FileOutputStream fos = new FileOutputStream(file);

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(shape);

            oos.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}


class Shape implements Serializable {
    int length;
    int height;
    int width;

    public Shape(int length, int height, int width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }
}