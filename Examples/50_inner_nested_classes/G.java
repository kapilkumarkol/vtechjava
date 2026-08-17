class A {
    //anonymous inner class
    static W t = new W() {
        public void pro() {
            System.out.println("pro1...");
        }  
    };

    static W u = new W() {
        public void pro() {
            System.out.println("pro2...");
        }
    };

    public static void main(String[] args) {
        t.pro();

        u.pro();
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