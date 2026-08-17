class X {
    void process() {
        System.out.println("Hello Ji");
    } 
}

class A extends X {
    public static void main(String[] args) {
        A y = new A();

        y.process();
        System.out.println(y.toString());        
        System.out.println(y.hashCode());
    }
}

// an example of multilevel inheritance
/*
            Object
               ^
               |
               X
               ^
               |
               A    
 */

