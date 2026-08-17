class ARunnable implements Runnable {
    public void run() {
        // System.out.println("Hello");
        for(int i=0;i<1000;i++) {

        }
    }
}

class A {
    public static void main(String[] args) {
        ThreadGroup ntg = new ThreadGroup("QUAD"); 

        ARunnable r = new ARunnable();

        Thread t1 = new Thread(r, "America");
        Thread t2 = new Thread(r, "Bharat");
        Thread t3 = new Thread(r, "Australia");
        Thread t4 = new Thread(r, "Japan");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        int activeThreadCount = Thread.currentThread().getThreadGroup().activeCount();
        System.out.println(activeThreadCount);
    }
}