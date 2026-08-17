package a1.a2.a3;


import b1.b2.*;
import b1.*;

class A {
    public static void main(String[] args) {
        B x = new B(); 
        System.out.println(x.y);

        B t = new B();
        System.out.println(t.y);
    }
}