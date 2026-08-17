class A {
    public static void main(String[] args) {
        Thread x = Thread.currentThread();

        System.out.println(x.getPriority());
        
        x.setPriority(11);
        
        System.out.println(x.getPriority());
    }        
}