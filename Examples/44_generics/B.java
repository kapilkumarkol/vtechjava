import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<? extends Object> x1 = new ArrayList<Cat>(); 
        ArrayList<? extends Object> x2 = new ArrayList<Company>(); 
        ArrayList<? extends Object> x3 = new ArrayList<Machine>(); 
        ArrayList<? extends Object> x4 = new ArrayList<Object>(); 
    }
}

class Cat { }
class Company { }
class Machine { }