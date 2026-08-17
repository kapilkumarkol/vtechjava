class A {
    //instance level 'variable' member
    int y = 9;

    //instance level 'method' member
    void pro() {
        System.out.println("pro");
    }
    
    //instance level 'class' member
    class B {

    }

    public static void main(String[] args) {
        A t = new A();
        
        //Case 3:
        B x = t.new B();

        //Case 2:
        t.pro();
        
        //Case 1:
        System.out.println(t.y);
        
    }
}