class A {
    public static void main(String[] args) {
        System.out.println("A");
        pro();
        System.out.println("B");
    }
    
    static void pro() {
        System.out.println("C");
        info();
        System.out.println("D");
    }
    
    static void info() {
        System.out.println("E");
        
        int y = 12 / 0;
        
        System.out.println("F");
    }
}