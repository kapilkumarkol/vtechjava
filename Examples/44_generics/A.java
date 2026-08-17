import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<?> x1 = new ArrayList<Cat>(); 
        ArrayList<?> x2 = new ArrayList<Company>(); 
        ArrayList<?> x3 = new ArrayList<Machine>(); 
        ArrayList<?> x4 = new ArrayList<Object>(); 
    }
}

class Cat { }
class Company { }
class Machine { }