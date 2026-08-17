class A {
    int y = 999;

    void info() {
        System.out.println("info method...");
    }

    //anonymous inner class
    static W t = new W() {
        public void pro() {
            System.out.println(y);
            info();
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