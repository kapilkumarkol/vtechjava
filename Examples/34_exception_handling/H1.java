import java.io.IOException;
import java.io.EOFException;

class A {
    public static void main(String[] args) {
        try {
            if(12<13) {
                throw new EOFException();
            } else {
                throw new IOException();
            }
        } catch(IOException e) {
            System.out.println("golu");
        } catch(EOFException e) {
            System.out.println("bablu");
        }
    }
}

// H1.java:14: error: exception EOFException has already been caught
//         } catch(EOFException e) {
//           ^
// 1 error