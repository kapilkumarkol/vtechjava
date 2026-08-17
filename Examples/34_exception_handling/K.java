class A {
    public static void main(String[] args) {
        try {
            System.out.println("A");
            int y = 12/0;
            System.out.println("B");
        } catch(ArithmeticException e) {
            System.out.println("C");
            throw new ArithmeticException();
            //rethrowing exception
        }
        
        System.out.println("D");
    }
}