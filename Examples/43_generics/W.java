import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<? extends X> y1 = new ArrayList<X1>();       
        ArrayList<? extends X> y2 = new ArrayList<X2>();       
        ArrayList<? extends X> y3 = new ArrayList<X>();       
    }
}

interface X { }

class X1 implements X {   }

class X2 implements X {   }