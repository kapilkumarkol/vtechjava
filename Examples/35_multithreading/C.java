class A {
    public static void main(String[] args) {
        Thread x = Thread.currentThread();
        
        System.out.println(x.getName());
        System.out.println(x.getId());
        System.out.println(x.getPriority());

        x.setName("Golu");
        x.setPriority(7);
        
        System.out.println(x.getName());
        System.out.println(x.getId());
        System.out.println(x.getPriority());
    }
}