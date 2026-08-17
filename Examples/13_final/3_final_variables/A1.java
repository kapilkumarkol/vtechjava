//you must initialize a variable at the time of declaration if declared final...

class A {
    final int y;
    final int e = 9;

    public static void main(String[] args) {
        A x = new A();

        System.out.println(x.y);
        System.out.println(x.e);
    }
}

/*
A1.java:2: error: variable y not initialized in the default constructor
    final int y;
 */