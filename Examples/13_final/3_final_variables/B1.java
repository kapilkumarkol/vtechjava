//you must initialize a variable at the time of declaration if declared final...

class A {
    final static float r;
    static final char g = '3';

    static public void main(String[] args) {
        System.out.println(r);
        System.out.println(g);
    }
}