class A {
    public static void main(String[] args) {
        // X a;    
        // X a = new X();   // NOT OK
        // X a = new Y();
        // X[] a = new Y[2];


        X[] a = new X[2];
        a[0] = new Y();
        a[1] = new Y();
    }
}

interface X {

}

class Y implements X {

}