class A {
    //anonymous inner class
    static W t = new W() {
        public void pro() {
            System.out.println("pro...");
        }  
    };

    public static void main(String[] args) {
        t.pro();
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