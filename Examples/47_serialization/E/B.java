import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

class B {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        Student st = (Student)(new ObjectInputStream(new FileInputStream("monu.txt")).readObject());
    
        System.out.println(st.name);
        System.out.println(st.age);
        System.out.println(st.college);
        System.out.println(st.marks);
    }    
}
