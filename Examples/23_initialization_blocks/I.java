class X {
    {
        System.out.println("Z");
    }

    static {
        System.out.println("M");
    }
}

class A extends X {
    {
        System.out.println("E");
    }
    
    static {
        System.out.println("T");
    }
    
    public static void main(String[] args) {
        System.out.println("A");

        A x = new A();

        System.out.println("B");
    }
}