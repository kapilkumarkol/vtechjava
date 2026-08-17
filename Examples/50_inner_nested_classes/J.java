class A {
    public static void main(String[] args) {
        //method local anonymous inner class
        X x = new X() {
            void pro() {
                System.out.println("Hiiii....");       
            }
        };

        x.pro();
    }
}

abstract class X {
    abstract void pro();
}