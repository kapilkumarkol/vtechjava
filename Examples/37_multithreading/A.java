class A {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println("Default Thread: " + t.getName());
        
        ThreadGroup tg = t.getThreadGroup();
        
        System.out.println("Thread Group of Default Thread: " + tg.getName());

        ThreadGroup parentTg = tg.getParent();

        System.out.println("Parent Thread Group of main Thread Group: " + parentTg.getName());
        
        ThreadGroup ppTg = parentTg.getParent();
                
        System.out.println("Parent Thread Group of system Thread Group: " + ppTg);
    }
}