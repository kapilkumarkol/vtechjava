class A {
    static void process() {
        System.out.println("Hello");
    }
    
    public static void main(String[] args) {
        process();
        
        go();        
    }
}

/*
A.java:8: error: cannot find symbol
        go();
        ^
  symbol:   method go()
  location: class A
1 error
 */