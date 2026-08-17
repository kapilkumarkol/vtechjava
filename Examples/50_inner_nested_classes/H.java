class A {
    private int y = 9999;

    private void info() {
        System.out.println("info method... !!");
    }

    //anonymous inner class
    W t = new W() {
        public void pro() {
            System.out.println(y);
            info();
        }  
    };

    public static void main(String[] args) {
        A x = new A();

        x.t.pro();
    }
}

interface W {
    void pro();
}

// class X implements W {
//     public void pro() {
//         System.out.println("Hi");
//     }
// }