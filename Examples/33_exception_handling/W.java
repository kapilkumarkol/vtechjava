import java.io.File;
import java.io.IOException;

class A {
    public static void main(String[] args) throws IOException {
        System.out.println("T"); 
        pro();      
        System.out.println("W");       
    }
    
    static void pro() throws IOException {
        System.out.println("Q");
        info();       
        System.out.println("I");
    }
    
    static void info() throws IOException {
        System.out.println("E");
        job();
        System.out.println("J");        
    }
    
    static void job() throws IOException {
        System.out.println("A");
        new File("bablu.txt").createNewFile();
        System.out.println("Y");
    }
}






