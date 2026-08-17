class X {

}

final class A extends X {

}

class B {
    public static void main(String[] args) {
        X a = new A();
        
        A w = (A)a;
    }
}