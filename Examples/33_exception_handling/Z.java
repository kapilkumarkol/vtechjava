import java.io.IOError;
import java.io.IOException;

class A /*extends Exception */ {
    public static void main(String[] args) {
        
        try {
            // throw new Error();
            // throw new RuntimeException();
            // throw new IOError(new ArithmeticException());
            // throw new IOError(new ArithmeticException());
            // throw new RuntimeException();
            //throw new Exception();
            // throw new IOException();

            // throw new A(); // uncomment line 4
        } catch(Throwable e) {
            e.printStackTrace();
        }
    }
}