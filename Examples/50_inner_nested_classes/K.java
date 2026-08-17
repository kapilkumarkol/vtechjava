class A {
    private static int e = 9;
    
    public static void main(String[] args) {
        //method local anonymous inner class
        X x = new X() {
            void pro() {
                System.out.println(e);       
            }
        };

        x.pro();
    }
}

abstract class X {
    abstract void pro();
}