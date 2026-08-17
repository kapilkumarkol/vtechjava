import java.io.IOException;
import java.io.EOFException;

class A {
    public static void main(String[] args) {
        try {
            if(12>13) {
                throw new EOFException();
            } else {
                throw new IOException();
            }
        } catch(EOFException e) {
            System.out.println("bablu");
        } catch(IOException e) {
            System.out.println("golu");
        } 
    }
}