class A {
    public static void main(String[] args) {
        Thread x = Thread.currentThread();

        System.out.println(x.getPriority());
        
        // x.setPriority(Thread.MAX_PRIORITY);
        // x.setPriority(Thread.MIN_PRIORITY);
        x.setPriority(Thread.NORM_PRIORITY);
        
        System.out.println(x.getPriority());
    }        
}