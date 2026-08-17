class A {
    public static void main(String[] args) {
        System.out.println("T"); 
        pro();      
        System.out.println("W");       
    }
    
    static void pro() {
        System.out.println("Q");
        info();       
        System.out.println("I");
    }
    
    static void info() {
        System.out.println("E");
        job();
        System.out.println("J");        
    }
    
    static void job() {
        System.out.println("A");
        int y = 12 / 0;
        System.out.println("Y");
    }
}