class A {
    void process() {
        System.out.println("Hello");
    }
    
    public static void main(String[] args) {
        A x = new A();
        
        x.process();
        
        System.out.println(x.toString());        
        System.out.println(x.hashCode());        
    }
}