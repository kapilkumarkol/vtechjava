class A {
    {
        System.out.println("T");
    }   

    static {
        System.out.println("G");
    }
    
    public static void main(String[] args) {
        
        System.out.println("A");

        A x = new A();        

        System.out.println("B");
    }

    {
        System.out.println("R");
    }

    static {
        System.out.println("E");
    }
}