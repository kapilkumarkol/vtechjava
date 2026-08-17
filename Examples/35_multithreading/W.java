class A {
    public static void main(String[] args) {
        Thread x = Thread.currentThread();

        System.out.println(x.getPriority());
        
        x.setPriority(7);
        
        System.out.println(x.getPriority());
    }        
}