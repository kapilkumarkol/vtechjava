class A {
    //instance level 'variable' member
    int y = 9;

    //instance level 'method' member
    void pro() {

    }
    
    //instance level 'class' member
    class B {

    }

    public static void main(String[] args) {
        //Case 3:
        // B x;

        // B x = new B();
        // error: non-static variable this cannot be referenced from a static context
        
        //Case 2:
        // pro();
        // error: non-static method pro() cannot be referenced from a static context

        //Case 1:
        // System.out.println(y);
        // error: non-static variable y cannot be referenced from a static context
    }
}