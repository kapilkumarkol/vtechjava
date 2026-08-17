import java.io.IOException;
import java.io.EOFException;

class A {
    public static void main(String[] args) {
        try {

        } catch(IOException e) {
            System.out.println("golu");
        } catch(EOFException e) {
            System.out.println("bablu");
        }
    }
}

// H.java:8: error: exception IOException is never thrown in body of corresponding try statement
//         } catch(IOException e) {
//           ^
// H.java:10: error: exception EOFException has already been caught
//         } catch(EOFException e) {
//           ^
// 2 errors